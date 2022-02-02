package Predavanja.dan_24_12_2021;

import Predavanja.dan_22_12_2021.Osoba;

import java.util.ArrayList;

public class Prodavnica {

    private String nazivProdavnice;
    private  String ulica;
    private ArrayList<Osoba> nizZaposlenih;
    private ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju;
    private ArrayList<Racun> nizObavljenihKupovina;

    public Prodavnica(String nazivprodavnice, String ulica) {
        this.nazivProdavnice = nazivprodavnice;
        this.ulica = ulica;
        this.nizZaposlenih = new ArrayList<Osoba>();
        this.nizProizvodaNaStajanju = new ArrayList<ProizvodNaStajanju>();
        this.nizObavljenihKupovina = new ArrayList<Racun>();
    }

    public String getNazivProdavnice() {
        return nazivProdavnice;
    }

    public String getUlica() {
        return ulica;
    }

    public ArrayList<Osoba> getNizZaposlenih() {
        return nizZaposlenih;
    }

    public ArrayList<ProizvodNaStajanju> getNizProizvodaNaStajanju() {
        return nizProizvodaNaStajanju;
    }

    public ArrayList<Racun> getNizObavljenihKupovina() {
        return nizObavljenihKupovina;
    }

    public void setNazivProdavnice(String nazivProdavnice) {
        this.nazivProdavnice = nazivProdavnice;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNizZaposlenih(ArrayList<Osoba> nizZaposlenih) {
        this.nizZaposlenih = nizZaposlenih;
    }

    public void setNizProizvodaNaStajanju(ArrayList<ProizvodNaStajanju> nizProizvodaNaStajanju) {
        this.nizProizvodaNaStajanju = nizProizvodaNaStajanju;
    }

    public void setNizObavljenihKupovina(ArrayList<Racun> nizObavljenihKupovina) {
        this.nizObavljenihKupovina = nizObavljenihKupovina;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Naziv prodavnice: ");
        sb.append(nazivProdavnice);
        sb.append("\n");

        sb.append("Ulica: ");
        sb.append(ulica);
        sb.append("\n");

        if (nizZaposlenih.isEmpty() == true) {
            sb.append("Nema zaposlenih radnika");
        }
        else {
            sb.append("Zaposleni radnici: \n");

            for (Osoba Osoba : nizZaposlenih) {
                sb.append(Osoba.getIme());
                sb.append(", ");
                sb.append(Osoba.getPrezime());
                sb.append("\n");
            }
        }

        if (nizProizvodaNaStajanju.isEmpty() == true) {
            sb.append("Nema proizvoda na stanju");
        }
        else {
            sb.append("Proizvodi na stanju: \n");

            for (ProizvodNaStajanju proizvodNaStajanju : nizProizvodaNaStajanju) {
                sb.append(proizvodNaStajanju.getProizvod());
                sb.append(", ");
                sb.append(proizvodNaStajanju.getKolicinaNaStanju());
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public void dodajzaposlenog(Osoba x) {
        nizZaposlenih.add(x);
    }

    public void ukloniZaposlenog(Osoba y) {
        nizZaposlenih.remove(y);
    }

    public void dodavanjeProizvodaNaStajanju(ProizvodNaStajanju p) {

        if(nizProizvodaNaStajanju.contains(p) == true){
            for(ProizvodNaStajanju pns : nizProizvodaNaStajanju){
                if(p.equals(pns) == true){
                    int novaKolicina = pns.getKolicinaNaStanju() + p.getKolicinaNaStanju();
                    pns.setKolicinaNaStanju(novaKolicina);
                }
            }
        }
        else{
            nizProizvodaNaStajanju.add(p);
        }
    }

    public Racun kupovina(Osoba kupac, ArrayList<Proizvod> listaZelja) {

        Racun r = new Racun(listaZelja, "27.12.2021", kupac, nizZaposlenih.get(0));

        for(Proizvod p : listaZelja){
            for(ProizvodNaStajanju pns : nizProizvodaNaStajanju){
                if(p.equals(pns.getProizvod())){
                    int novaKolicina = pns.getKolicinaNaStanju() - 1;
                    pns.setKolicinaNaStanju(novaKolicina);
                    break;
                }
            }
        }

        nizObavljenihKupovina.add(r);
        return r;
    }
}
