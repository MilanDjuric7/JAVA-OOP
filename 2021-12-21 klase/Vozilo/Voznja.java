package domaci_21_12_2021.Vozilo;

import domaci_21_12_2021.Vozilo.Automobil;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {

        // Napisati klasu Voznja iz koje ce program moci da se pokrene.
        // U njoj ce se kreirati najmanje dva automobila.
        // Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Unesite marku prvog automobila: ");
        String marka = sc.next();

        System.out.println("Unesite model prvog automobila: ");
        String model = sc.next();

        System.out.println("Unesite serijski broj prvog automobila: ");
        int serijskiBroj = sc.nextInt();

        System.out.println("Unesite ime vlasnika prvog automobila: ");
        String vlasnik = sc.next();

        Automobil prvi = new Automobil(marka, model, serijskiBroj, vlasnik);

        System.out.println("Unesite marku drugog automobila: ");
        String marka2 = sc.next();

        System.out.println("Unesite model drugog automobila: ");
        String model2 = sc.next();

        System.out.println("Unesite serijski broj drugog automobila: ");
        int serijskiBroj2 = sc.nextInt();

        System.out.println("Unesite ime vlasnika drugog automobila: ");
        String vlasnik2 = sc.next();

        Automobil drugi = new Automobil(marka2, model2, serijskiBroj2);

        System.out.println();
        System.out.println("Marka prvog automobila je: " + prvi.getMarka());
        System.out.println("Model prvog automobila je: " + prvi.getModel());
        System.out.println("Serijski broj prvog automobila je: " + prvi.getSerijskiBroj());
        System.out.println("Ime vlasnika prvog automobila je: " + prvi.getVlasnik());

        System.out.println();
        System.out.println("Marka drugog automobila je: " + drugi.getMarka());
        System.out.println("Model drugog automobila je: " + drugi.getModel());
        System.out.println("Serijski broj drugog automobila je: " + drugi.getSerijskiBroj());
        System.out.println("Ime vlasnika drugog automobila je: " + drugi.getVlasnik());   // Ovo ce biti null
                                                                                    // Ali zelim da testiram

        if (drugi.getVlasnik() == null) {
            System.out.println("Automobil nema vlasnika.");
        }

        prvi.setVlasnik("Milan");

        System.out.println();
        System.out.println("Novi vlasnik prvog automobila je: " + prvi.getVlasnik());

        drugi.setVlasnik("Zoran");

        System.out.println();
        System.out.println("Novi prvi vlasnik drugog automobila je: " + drugi.getVlasnik());

        System.out.println();
        System.out.println("Model prvog automobila je: " + prvi.getModel());

        System.out.println("\n*** Kraj programa ***");
    }
}
