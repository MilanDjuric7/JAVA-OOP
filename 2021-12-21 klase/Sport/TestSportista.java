package domaci_21_12_2021.Sport;

import java.util.Scanner;

public class TestSportista {
    public static void main(String[] args) {

        // Napisati glavni program koji kreira tri igraca.
        // U glavnom programu iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Sportista.

        Scanner sc = new Scanner(System.in);

        Sportista prvi = new Sportista("Petar Petrovic", "kosarka", "FMP", 77);

        System.out.println("\nOBAVESTENJE: Prvi i treci sportista se ocitavaju iz ispisa!");

        System.out.println("\nUnesite ime i prezime drugog sportiste: ");
        String ime = sc.nextLine();

        System.out.println("Unesite sport kojim se bavi: ");
        String sport = sc.nextLine();

        System.out.println("Unesite klub za koji igra: ");
        String klub = sc.nextLine();

        System.out.println("Unesite broj koji nosi na dresu: ");
        int broj = sc.nextInt();

        Sportista drugi = new Sportista(ime, sport, klub, broj);

        Sportista treci = new Sportista("Milos Jovanovic", "odbojka",
                "Jedinstvo Nova Pazova", 15);

        System.out.println();
        System.out.println("Igrac " + prvi.getImeIPrezime() + ", bavi se sportom "
                + prvi.getSport() + " i trenira u klubu " + prvi.getKlub() +
                ", a broj na dresu koji nosi je " + prvi.getBroj() + ".\n");

        System.out.println("Igrac " + drugi.getImeIPrezime() + ", bavi se sportom "
                + drugi.getSport() + " i trenira u klubu " + drugi.getKlub() +
                ", a broj na dresu koji nosi je " + drugi.getBroj() + ".\n");

        System.out.println("Igrac " + treci.getImeIPrezime() + ", bavi se sportom "
                + treci.getSport() + " i trenira u klubu " + treci.getKlub() +
                ", a broj na dresu koji nosi je " + treci.getBroj() + ".\n");

        System.out.println();
        prvi.setKlub("Mega Vizura");
        System.out.println("Prvi igrac je promenio klub i sada trenira u " + prvi.getKlub() + ".\n");

        treci.setBroj(106);
        System.out.println(treci.getImeIPrezime() + " je promenio broj na dresu i sada nosi "
                + treci.getBroj() + ".");

        System.out.println("\n*** Kraj programa ***");
    }
}
