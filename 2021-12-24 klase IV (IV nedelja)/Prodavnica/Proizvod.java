package Predavanja.dan_24_12_2021;

public class Proizvod {

    private String naziv;
    private double cena;
    private String opisProizvoda;
    private int tezinaproizvodaUGramima;

    public Proizvod(String naziv, double cena, String opisProizvoda, int tezinaproizvodaUGramima) {
        this.naziv = naziv;
        this.cena = cena;
        this.opisProizvoda = opisProizvoda;
        this.tezinaproizvodaUGramima = tezinaproizvodaUGramima;
    }

    public Proizvod(String naziv, double cena, int tezinaproizvodaUGramima) {
        this.naziv = naziv;
        this.cena = cena;
        this.tezinaproizvodaUGramima = tezinaproizvodaUGramima;
    }

    public String getNaziv() {
        return naziv;
    }

    public double getCena() {
        return cena;
    }

    public String getOpisProizvoda() {
        return opisProizvoda;
    }

    public int getTezinaproizvodaUGramima() {
        return tezinaproizvodaUGramima;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setOpisProizvoda(String opisProizvoda) {
        this.opisProizvoda = opisProizvoda;
    }

    public void setTezinaproizvodaUGramima(int tezinaproizvodaUGramima) {
        this.tezinaproizvodaUGramima = tezinaproizvodaUGramima;
    }

    public String tostring() {

        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(naziv);
        sb.append("\n");

        sb.append("Cena proizvoda: ");
        sb.append(cena);
        sb.append("\n");

        sb.append("Opis proizvoda: ");
        sb.append(opisProizvoda);
        sb.append("\n");

        sb.append("Tezina proizvoda: ");
        sb.append(tezinaproizvodaUGramima);
        sb.append(" g.\n");

        return sb.toString();
    }
}
