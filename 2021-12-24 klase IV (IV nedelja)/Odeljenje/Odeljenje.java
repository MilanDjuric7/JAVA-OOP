package Domaci.domaci_24_12_2021;

import java.util.ArrayList;

public class Odeljenje {

    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

    public void upisiUcenika(Ucenik u, int redniBroj) {
        dnevnik.add(redniBroj, u);
    }

    public void ispisiUcenika(Ucenik u) {
        dnevnik.remove(u);
    }

    public void ispisiUcenika(int i) {
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik u) {
        if (u.getNizOcena().isEmpty()) {
            System.out.println("Ucenik nema ocene.");
        }
        else {
            System.out.println(u.getNizOcena());
        }
    }

    public void pogledajOcene(int i) {
        if (dnevnik.get(i).getNizOcena().isEmpty()) {
            System.out.println("Ucenik nema ocene.");
        }
        else {
            System.out.println(dnevnik.get(i).getNizOcena());
        }
    }

    public void prosecnaOcena(Ucenik u) {
        System.out.println(u.prosekOcena());
    }

    public void prosecnaOcena(int i) {
        System.out.println(dnevnik.get(i).prosekOcena());
    }

    public double prosecnaOcenaOdeljenja() {
        double suma = 0;
        if (dnevnik.isEmpty()) {
            return 0;
        }
        else {
            for (int i = 0; i < dnevnik.size(); i++) {
                suma = suma + dnevnik.get(i).prosekOcena();

            }
        }
        double prosecnaOcenaOdeljenja = suma / dnevnik.size();

        return prosecnaOcenaOdeljenja;
    }

    public void opisnaOcena(Ucenik u) {
        if (u.prosekOcena() > 4.5 || u.prosekOcena() < 5.0) {
            System.out.println("Odlican");
        }
        else if (u.prosekOcena() > 3.5) {
            System.out.println("Vrlo dobar");
        }
        else if (u.prosekOcena() > 2.5) {
            System.out.println("Dobar");
        }
        else if (u.prosekOcena() > 1.5) {
            System.out.println("Dovoljan");
        }
        else if (u.prosekOcena() < 1.5) {
            System.out.println("Nedovoljan");
        }
    }

    public String izlistajDnevnik() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dnevnik.size(); i++) {
            sb.append(dnevnik.get(i).getIme());
            sb.append(" ");
            sb.append(dnevnik.get(i).getPrezime());
            sb.append(" ima ocene: ");
            sb.append(dnevnik.get(i).getNizOcena());
            sb.append("\n");

        }
        return sb.toString();
    }

    public String velicinaOdeljenja() {

        String poruka;

        if (dnevnik.size() == 0) {
            poruka = "Nema ucenika u odeljenju\n";
        }
        else if (dnevnik.size() < 15) {
            poruka = "Malo odeljenje\n";
        }
        else if (dnevnik.size() < 25) {
            poruka = "Srednje odeljenje\n";
        }
        else {
            poruka = "Veliko odeljenje\n";
        }
        return poruka;
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(oznaka);
        sb.append(" odeljenje ima djake: ");
        sb.append("\n");

        for (int i = 0; i < dnevnik.size(); i++) {
            sb.append(dnevnik.get(i).getIme());
            sb.append(" ");
            sb.append(dnevnik.get(i).getPrezime());
            sb.append("\n");

        }
        return sb.toString();
    }
}
