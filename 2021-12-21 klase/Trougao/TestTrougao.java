package dan_21_12_2021.Trougao;

import dan_21_12_2021.Trougao.Trougao;

import java.util.Scanner;

public class TestTrougao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nUnesite duzinu stranice 'A' trougla: ");
        double stranicaA = sc.nextDouble();

        System.out.println("Unesite duzinu stranice 'B' trougla: ");
        double stranicaB = sc.nextDouble();

        System.out.println("Unesite duzinu stranice 'C' trougla: ");
        double stranicaC = sc.nextDouble();

        Trougao tr1 = new Trougao(stranicaA, stranicaB, stranicaC);

        System.out.println(tr1);

        System.out.println("\nObim trougla je: " + tr1.obim() + " cm.");

        System.out.println("Povrsina trougla je: " + tr1.povrsina() + " cm kvadratnih.");

        tr1.setStranicaA(1000);

        System.out.println("\n*** Kraj programa ***");
    }
}
