package Domaci.domaci_27_12_2021;

import java.util.ArrayList;

public class ArrayListe {
        public static void main(String[] args) {

                /* Kreirajte array listu nekog vaseg interesovanje (npr sport)
                - u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
                - iz liste dohvatite 3. element liste i ispisite
                - promenite naziv prvog elementa
                - uklonite 5. element
                - ispisite velicinu vase liste
                - pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste*/

                ArrayList<String> Sport = new ArrayList<>();

                Sport.add("Fudbal");
                Sport.add("Kosarka");
                Sport.add("Odbojka");
                Sport.add("Rukomet");
                Sport.add("Vaterpolo");
                Sport.add("Skijanje");
                Sport.add("Plivanje");

                System.out.println();
                System.out.println("Treci element niza Sport je: ");
                System.out.println(Sport.get(2));

                System.out.println();
                Sport.set(0, "Bocanje");
                System.out.println("Zamenjen je prvi element niza novim, a novi element je: ");
                System.out.println(Sport.get(0));

                System.out.println();
                Sport.remove(4);
                System.out.println("Izbacen je cetvrti element niza");

                System.out.println();
                System.out.println("I sada je ukupni broj elemenata niza: ");
                System.out.println(Sport.size());

                System.out.println();
                System.out.println("A svi elementi niza su: ");

                for (int i = 0; i < Sport.size(); i++) {
                        System.out.println(Sport.get(i));

                }

                System.out.println();
                System.out.println("Ili i drugom metodom: ");

                for (String s : Sport) {
                        System.out.println(s);
                }

                System.out.println("\n*** Kraj programa ***");
        }
}
