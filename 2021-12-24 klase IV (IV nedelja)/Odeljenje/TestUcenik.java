package Domaci.domaci_24_12_2021;

public class TestUcenik {
    public static void main(String[] args) {

        Ucenik u1 = new Ucenik("Milan", "Djuric");
        Ucenik u2 = new Ucenik("Nenad", "Djuric");

        System.out.println(u2);

        u1.dodajOcenu(5);
        u1.dodajOcenu(4);
        u1.dodajOcenu(7);
        u1.dodajOcenu(2);
        u1.dodajOcenu(3);

        System.out.println();
        System.out.println("Ocene koje ima ucenik " + u1.getIme() + " " + u1.getPrezime() +
                " su: " + u1.getNizOcena());
        System.out.println("Prosek ocena koje ima ucenik " + u1.getIme() + " " + u1.getPrezime() +
                " je: " + u1.prosekOcena());

        System.out.println("\n*** Kraj programa ***");
    }
}
