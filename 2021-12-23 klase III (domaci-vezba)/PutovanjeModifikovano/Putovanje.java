package domaci_22_12_2021.PutovanjeModifikovano;

import dan_21_12_2021.Automobil;
import dan_22_12_2021.Osoba;

import java.util.ArrayList;

public class Putovanje {

    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostUKm;
    private ArrayList<Osoba> nizprijavljenihOsoba;

    private void daLiJeKmNegativan(double udaljenostUKm) {
        if(udaljenostUKm < 0){
            System.out.println("Napravili Ste gresku. Udaljenost ne moze biti negativna!");
        }
        else{
            this.udaljenostUKm = udaljenostUKm;
        }
    }

    public Putovanje(Grad destinacija, Osoba vodjaPuta,
                     Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vodjaPuta = vodjaPuta;
        this.vozilo = vozilo;
        daLiJeKmNegativan(udaljenostUKm);
        this.nizprijavljenihOsoba = new ArrayList<Osoba>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostUKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        daLiJeKmNegativan(udaljenostUKm);
        this.nizprijavljenihOsoba = new ArrayList<Osoba>();

    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public double getUdaljenostUKm() {
        return udaljenostUKm;
    }

    public ArrayList<Osoba> getNizprijavljenihOsoba() {
        return nizprijavljenihOsoba;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public void setNizprijavljenihOsoba(ArrayList<Osoba> nizprijavljenihOsoba) {
        this.nizprijavljenihOsoba = nizprijavljenihOsoba;
    }

    public void setUdaljenostUKm(double udaljenostUKm) {
        daLiJeKmNegativan(udaljenostUKm);
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Destinacija:");
        sb.append(destinacija.getImeGrada());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");

        if (vodjaPuta == null) {
            sb.append("Putovanje nema vodju puta.\n");
        }
        else {
            sb.append("Vodja puta: ");
            sb.append(vodjaPuta.getIme());
            sb.append(" ");
            sb.append(vodjaPuta.getPrezime());
            sb.append("\n");
        }

        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodiste());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");

        sb.append("Udaljenost do destinacije u kilometrima je: ");
        sb.append(udaljenostUKm);
        sb.append("\n");

        sb.append("Potrebno vreme za putovanje do zeljene destinacije je: ");
        sb.append(kolikoVremena(vozilo.getProsecnaBrzina()));
        sb.append(" h.\n");

        if (nizprijavljenihOsoba.isEmpty() == true) {
            sb.append("Nema prijavljenih osoba");
        }
        else {
            sb.append("Na putovanje idu: \n");

            for (Osoba Osoba : nizprijavljenihOsoba) {
                sb.append(Osoba.getIme());
                sb.append(" ");
                sb.append(Osoba.getPrezime());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public double kolikoVremena(double prosecnaBrzina) {
        double vreme = udaljenostUKm / prosecnaBrzina;
        return vreme;
    }


    public void dodajCoveka(Osoba x) {
        nizprijavljenihOsoba.add(x);
    }

    public void ukloniPutnika(Osoba y) {
        nizprijavljenihOsoba.remove(y);
    }
}
