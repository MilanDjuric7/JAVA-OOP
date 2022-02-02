package domaci_22_12_2021.Knjige;

import dan_22_12_2021.Osoba;

public class TestKnjiga {
    public static void main(String[] args) {

        // Napisati i test program, gde je potrebno napraviti 2-3 osobe, i 2-3 knjige.
        // Ispisati osobe, ispisati knjige. Ispisati koje su velicine knjiga (edited)

        Osoba o1 = new Osoba("Petar", "Petrovic");
        Osoba o2 = new Osoba("Jovan", "Jovanovic");
        Osoba o3 = new Osoba("Marko", "Markovic");

        Knjiga k1 = new Knjiga("Zima", o1, o2, 278, 1978);
        Knjiga k2 = new Knjiga("Programiranje", o3, 590, 2015);
        Knjiga k3 = new Knjiga("Sporstske povrede", o3,
                o2, 92, 2010);

        System.out.println();
        System.out.println(o1 + "\n");
        System.out.println(k1 + "\n");
        System.out.println(k3 + "\n");

        o2.setIme("Dragan");
        o2.setPrezime("Ukic");
        k2.setAutor(o2);

        System.out.println(k2);

    }

}
