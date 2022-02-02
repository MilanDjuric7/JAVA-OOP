package Predavanja.dan_24_12_2021;

public class ProizvodNaStajanju {

    private Proizvod proizvod;
    private int kolicinaNaStanju;

    public ProizvodNaStajanju(Proizvod proizvod, int kolicinaNaStanju) {
        this.proizvod = proizvod;
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public ProizvodNaStajanju(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public Proizvod getProizvod() {
        return proizvod;
    }

    public int getKolicinaNaStanju() {
        return kolicinaNaStanju;
    }

    public void setProizvod(Proizvod proizvod) {
        this.proizvod = proizvod;
    }

    public void setKolicinaNaStanju(int kolicinaNaStanju) {
        this.kolicinaNaStanju = kolicinaNaStanju;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Naziv proizvoda: ");
        sb.append(proizvod.getNaziv());
        sb.append("\n");

        sb.append("kolicina na stajanju: ");
        sb.append(kolicinaNaStanju);
        sb.append("\n");

        return sb.toString();
    }
}
