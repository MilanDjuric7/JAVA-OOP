package dan_21_12_2021.Trougao;

public class Trougao {

    // Klasa trougao ima 3 polja koji predstavljaju stranice: stranicaA, stranicaB, stranicaC.
    // Vrednost stranica je tipa double. Napisati konstruktor, getter i setter metode za sve stranice
    // i metode za racunanje obima i povrsine.

    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public boolean daLiJeTrougaoValidan() {


        // vrati true ako jeste
        // vrati false ako nije
        // trougao nije validan ako zbir duzina bilo koje 2 stranice je manji od duzine trece

        if (stranicaA <= 0 || stranicaB <= 0 || stranicaC <= 0) {
            return false;
        }
        else if (stranicaA + stranicaB < stranicaC) {
            return false;
        }
        else if (stranicaA + stranicaC < stranicaB) {
            return false;
        }
        else if (stranicaB + stranicaC < stranicaA) {
            return false;
        }
        else {
            return true;
        }
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
            if(validan == false) {
                System.out.println("Pokusavate kreitati nevalidan trougao");

            }
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false) {
            System.out.println("Vase menjane duzine stranice A je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false) {
            System.out.println("Vase menjane duzine stranice B je ucinilo ovaj trougao nevalidnim");
        }
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false) {
            System.out.println("Vase menjane duzine stranice C je ucinilo ovaj trougao nevalidnim");
        }
    }

    public double obim() {

        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    public double povrsina() {

        double s = (stranicaA + stranicaB + stranicaC) / 2;
        double p = Math.sqrt(s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC));
        return p;
    }

    public String toString() {
        // String vracenString;
        // vracenString = "\nDuzina stranice 'A' trougla je: " + stranicaA + " cm.\n";
        // vracenString += "Duzina stranice 'B' trougla je: " + stranicaB + " cm.\n";
        // vracenString += "Duzina stranice 'C' trougla je: " + stranicaC + " cm.\n";
        // return vracenString;

        StringBuilder sb = new StringBuilder();
        sb.append("\nDuzina stranice 'A' trougla je: ");
        sb.append(stranicaA);
        sb.append(" cm.\n");

        sb.append("Duzina stranice 'B' trougla je: ");
        sb.append(stranicaB);
        sb.append(" cm.\n");

        sb.append("Duzina stranice 'C' trougla je: ");
        sb.append(stranicaC);
        sb.append(" cm.\n");

        String stringSB = sb.toString();
        return stringSB;
    }
}
