package domaci_22_12_2021.Glumci;

import domaci_22_12_2021.Glumci.Glumac;

public class TestGlumac {
    public static void main(String[] args) {

        Glumac muski = new Glumac("Dragan", "Petrovic", 'm', 32,
                9.3, true);

        Glumac zenski = new Glumac("Jovana", "Pavlovic", 'z', 27,
                9.5, false);

        System.out.println();
        System.out.println(muski);

        System.out.println(zenski);

        zenski.setOcena(9.7);
        System.out.println("Nova ocena zenskog glumca je: " + zenski.getOcena());

        System.out.println("\n*** Kraj programa ***");
    }
}
