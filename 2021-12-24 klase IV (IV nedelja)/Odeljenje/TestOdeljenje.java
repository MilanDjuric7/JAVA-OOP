package Domaci.domaci_24_12_2021;

import java.util.ArrayList;

public class TestOdeljenje {
    public static void main(String[] args) {

        Ucenik u1 = new Ucenik("Milan", "Djuric");
        Ucenik u2 = new Ucenik("Nenad", "Djuric");
        Ucenik u3 = new Ucenik("Milos", "Pavlovic");
        Ucenik u4 = new Ucenik("Ivan", "Peric");
        Ucenik u5 = new Ucenik("Dimitrije", "Nisavic");

        System.out.println(u2);

        u1.dodajOcenu(5);
        u1.dodajOcenu(4);
        u1.dodajOcenu(7);
        u1.dodajOcenu(2);
        u1.dodajOcenu(3);

        u3.getNizOcena().add(4);
        u3.getNizOcena().add(5);
        u3.getNizOcena().add(8);
        u3.getNizOcena().add(3);

        u4.getNizOcena().add(5);
        u4.getNizOcena().add(3);
        u4.getNizOcena().add(4);

        u5.getNizOcena().add(5);
        u5.getNizOcena().add(5);
        u5.getNizOcena().add(5);

        System.out.println();
        System.out.println("Ocene koje ima ucenik " + u1.getIme() + " " + u1.getPrezime() +
                " su: " + u1.getNizOcena());
        System.out.println("Prosek ocena koje ima ucenik " + u1.getIme() + " " + u1.getPrezime() +
                " je: " + u1.prosekOcena());


        System.out.println();
        System.out.println("Ocene koje ima ucenik " + u3.getIme() + " " + u3.getPrezime() +
                " su: " + u3.getNizOcena());
        System.out.println("Prosek ocena koje ima ucenik " + u3.getIme() + " " + u3.getPrezime() +
                " je: " + u3.prosekOcena());

        System.out.println();
        System.out.println("Ocene koje ima ucenik " + u5.getIme() + " " + u5.getPrezime() +
                " su: " + u5.getNizOcena());
        System.out.println("Prosek ocena koje ima ucenik " + u5.getIme() + " " + u5.getPrezime() +
                " je: " + u5.prosekOcena());

        ArrayList<Ucenik> Ucenici = new ArrayList<>();
        Ucenici.add(u1);
        Ucenici.add(u3);

        Odeljenje o1 = new Odeljenje("IV/1", Ucenici);

        System.out.println();
        System.out.println(o1);

        o1.upisiUcenika(u2);
        System.out.println(o1);

        Odeljenje o2 = new Odeljenje("IV/2");

        o2.upisiUcenika(u4);
        o2.upisiUcenika(u5);

        System.out.println();
        System.out.println(o2);

        o1.ispisiUcenika(1);

        System.out.println();
        System.out.println(o1);

        System.out.println("Ucenik " + u4.getIme() + " " + u4.getPrezime() + " ima ocene: ");
        o2.pogledajOcene(u4);

        System.out.println();
        System.out.println("Ucenik " + u5.getIme() + " " + u5.getPrezime() + " ima ocene: ");
        o2.pogledajOcene(1);

        System.out.println("\n*** Kraj programa ***");
    }
}
