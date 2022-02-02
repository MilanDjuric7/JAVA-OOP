package Domaci.domaci_27_12_2021;

public class DuplaPetlja {
    public static void main(String[] args) {

        // U konzolu ispisati dane (dan 1, dan 2...dan 7) za 3 nedelje

        int brojac = 0;
        int brojac2 = 0;

        for (int i = 0; i < 3; i++) {
            brojac ++;
            System.out.println("\nWeek: " + brojac);
            System.out.println();
            for (int j = 0; j < 7; j++) {
                brojac2 ++;
                if (brojac2 > 7) {
                    brojac2 = 1;
                }
                System.out.println("Day: " + brojac2);

            }
        }

        System.out.println("\n*** Kraj programa ***");
    }
}
