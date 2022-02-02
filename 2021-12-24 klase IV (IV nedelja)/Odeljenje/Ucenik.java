package Domaci.domaci_24_12_2021;

import java.util.ArrayList;

public class Ucenik {

    private String ime;
    private String prezime;
    private ArrayList<Integer> nizOcena;

    public Ucenik(String ime, String prezime, ArrayList<Integer> nizOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = nizOcena;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ArrayList<Integer> getNizOcena() {
        return nizOcena;
    }

    public void setNizOcena(ArrayList<Integer> nizOcena) {
        this.nizOcena = nizOcena;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);

        if (nizOcena.isEmpty() == true) {
            sb.append(" nema ocene.");
        }
        else {
            sb.append(" ima ocene: \n");

            for (int ocena : nizOcena) {
                sb.append("\n");

            }
        }

        return sb.toString();
    }

    public void dodajOcenu(int o) {
        if (o > 5 || o < 1) {
            System.out.println("\nUneli Ste nevalidnu ocenu. Ocene mogu imati vrednost od 1 do 5!");
        }
        else {
            nizOcena.add(o);
        }
    }

    public double prosekOcena() {
        double suma = 0;

        if (nizOcena.contains(1)) {
            return 1;
        }
        else if (nizOcena.isEmpty()) {
            return 0;
        }
        else {
            for (int ocena : nizOcena) {
                suma = suma + ocena;
            }
            double prosekOcena = suma / nizOcena.size();
            return prosekOcena;
        }
    }
}
