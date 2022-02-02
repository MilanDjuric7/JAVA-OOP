package domaci_22_12_2021.PutovanjeModifikovano;

import dan_21_12_2021.Automobil;
import dan_22_12_2021.Osoba;

public class TestPutovanjeModifikovano {
    public static void main(String[] args) {

        Grad g1 = new Grad("Beograd", 2000000, "Srbija");
        Grad g2 = new Grad("London", 10000000, "Engleska");
        Grad g3 = new Grad("Moskva", 20000000, "Rusija");

        Automobil a1 = new Automobil("Renault", "Francuska",
                2010, 150000, 130);
        Automobil a2 = new Automobil("Zastava", "Srbistan",
                1993, 300000, 70);
        Automobil a3 = new Automobil("Fiat", "Italija",
                2005, 220000,90);

        Osoba o1 = new Osoba("Petar", "Petrovic");
        Osoba o2 = new Osoba("Milos", "Marjanovic");
        Osoba o3 = new Osoba("Dragan", "Ivanovic");

        Putovanje p1 = new Putovanje(g1, o2, a3, 45);
        Putovanje p2 = new Putovanje(g2, o3, a1, 2500);
        Putovanje p3 = new Putovanje(g3, o1, a2, 3500);

        System.out.println();
        System.out.println(p1);

        System.out.println();
        System.out.println(p3);

        System.out.println("\nLista putnika za prvo putovanje: ");
        System.out.println();
        p1.dodajCoveka(o3);
        System.out.println(p1);

        System.out.println("\nLista putnika za drugo putovanje: \n");
        p2.dodajCoveka(o2);
        p2.dodajCoveka(o1);
        System.out.println(p2);

        System.out.println();
        p2.dodajCoveka(o3);
        System.out.println(p2);

        System.out.println();
        p2.ukloniPutnika(o2);
        System.out.println(p2);
    }
}
