package Predavanja.dan_24_12_2021;

import Predavanja.dan_22_12_2021.Osoba;

import java.util.ArrayList;

public class Racun {

    private ArrayList<Proizvod> nizKupljenihProizvoda;
    private String datum;
    private Osoba kupac;
    private Osoba prodavac;
    private double iznos;

    public Racun(ArrayList<Proizvod> nizKupljenihProizvoda, String datum, Osoba kupac, Osoba prodavac) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;

        this.iznos = 0;
        for (Proizvod p : nizKupljenihProizvoda) {
            this.iznos = this.iznos + p.getCena();
        }
    }

    public Racun(String datum, Osoba kupac, Osoba prodavac) {
        this.datum = datum;
        this.kupac = kupac;
        this.prodavac = prodavac;
        this.nizKupljenihProizvoda = new ArrayList<Proizvod>();
    }

    public ArrayList<Proizvod> getNizKupljenihProizvoda() {
        return nizKupljenihProizvoda;
    }

    public String getDatum() {
        return datum;
    }

    public Osoba getKupac() {
        return kupac;
    }

    public Osoba getProdavac() {
        return prodavac;
    }

    public double getIznos() {
        return iznos;
    }

    public void setNizKupljenihProizvoda(ArrayList<Proizvod> nizKupljenihProizvoda) {
        this.nizKupljenihProizvoda = nizKupljenihProizvoda;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public void setKupac(Osoba kupac) {
        this.kupac = kupac;
    }

    public void setProdavac(Osoba prodavac) {
        this.prodavac = prodavac;
    }

    public void dodajProizvod(Proizvod p) {
        nizKupljenihProizvoda.add(p);
        iznos = iznos + p.getCena();
    }

    public void ukloniProizvod(Proizvod p) {
        boolean uklonjen = nizKupljenihProizvoda.remove(p);
        if (uklonjen == true) {
            iznos = iznos - p.getCena();
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Kupac: ");
        sb.append(kupac.getIme());
        sb.append(" ");
        sb.append(kupac.getPrezime());
        sb.append("\n");

        sb.append("Prodavac: ");
        sb.append(prodavac.getIme());
        sb.append(" ");
        sb.append(prodavac.getPrezime());
        sb.append("\n");

        sb.append("Datum: ");
        sb.append(datum);
        sb.append("\n");

        sb.append("Iznos: ");
        sb.append(iznos);
        sb.append("\n");

        if (nizKupljenihProizvoda.isEmpty() == true) {
            sb.append("Nema kupljenih proizvoda.");
        }
        else {
            sb.append("Kupljeni proizvodi: \n");

            for (Proizvod proizvod : nizKupljenihProizvoda) {
                sb.append(proizvod.getNaziv());
                sb.append(", ");
                sb.append(proizvod.getCena());
                sb.append("\n");
            }
        }

        return sb.toString();
    }
}
