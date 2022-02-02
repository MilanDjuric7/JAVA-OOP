package Domaci.domaci_27_12_2021.PrevoznoSredstvo;

public class TestPrevoznoSredstvo {
    public static void main(String[] args) {

        Automobil a = new Automobil(2010, "Francuska",
                "Renault", "tce", 1.2);
        Autobus au = new Autobus(2009, "Nemacka",
                "BMW", 55);
        Voz v = new Voz(2005, "Srbija", "Gosa", 7);

        String x = a.getClass().toString();
        String[] xSplitovan = x.split("\\.");

        String y = au.getClass().toString();
        String[] ySplitovan = y.split("\\.");

        String z = v.getClass().toString();
        String[] zSplitovan = z.split("\\.");

        String imeKlaseAutomobil = xSplitovan[xSplitovan.length - 1];
        String imeKlaseAutobus = ySplitovan[ySplitovan.length - 1];
        String imeKlaseVoz = zSplitovan[zSplitovan.length - 1];

        System.out.println();
        System.out.println("Sirena prevoznog sredstva " + imeKlaseAutomobil + " je: ");
        a.sirena();

        System.out.println();
        System.out.println("Sirena prevoznog sredstva " + imeKlaseAutobus + " je: ");
        au.sirena();

        System.out.println();
        System.out.println("Sirena prevoznog sredstva " + imeKlaseVoz + " je: ");
        v.sirena();

        System.out.println("\n*** Kraj programa ***");
    }
}
