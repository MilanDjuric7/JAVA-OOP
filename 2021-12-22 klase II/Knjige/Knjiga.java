package domaci_22_12_2021.Knjige;

import dan_22_12_2021.Osoba;

public class Knjiga {

    private String nazivKnjige;
    private Osoba autor;
    private Osoba vlasnik;
    private int brojStrana;
    private int godinaIzdanja;
    //private void proveraZaBrojStrana;

    public Knjiga(String nazivKnjige, Osoba autor, Osoba vlasnik, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;
        this.vlasnik = vlasnik;

        if (brojStrana < 0) {
            System.out.println("Napravili Ste gresku. Broj strana ne moze biti negativan!");
        }
        else {
            this.brojStrana = brojStrana;
        }

        if (godinaIzdanja < 0) {
            System.out.println("Napravili Ste gresku. Godina izdanja ne moze biti negativna!");
        }
        else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public Knjiga(String nazivKnjige, Osoba autor, int brojStrana, int godinaIzdanja) {
        this.nazivKnjige = nazivKnjige;
        this.autor = autor;

        if (brojStrana < 0) {
            System.out.println("Napravili Ste gresku. Broj strana ne moze biti negativan!");
        }
        else {
            this.brojStrana = brojStrana;
        }

        if (godinaIzdanja < 0) {
            System.out.println("Napravili Ste gresku. Godina izdanja ne moze biti negativna!");
        }
        else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String getNazivKnjige() {
        return nazivKnjige;
    }

    public Osoba getAutor() {
        return autor;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setNazivKnjige(String nazivKnjige) {
        this.nazivKnjige = nazivKnjige;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public void setBrojStrana(int brojStrana) {
        if (brojStrana <= 0) {
            System.out.println("Napravili Ste gresku. Broj strana ne moze biti negativan!");
        }
        else {
            this.brojStrana = brojStrana;
        }
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        if (godinaIzdanja <= 0) {
            System.out.println("Napravili Ste gresku. Godina izdanja ne moze biti negativna!");
        }
        else {
            this.godinaIzdanja = godinaIzdanja;
        }
    }

    public String velicinaKnjige() {
        // "mala knjiga" - ako je broj strana od 0 do 100
        // "srednje velika knjiga" - ako je broj strana od 101 do 300
        // "velika knjiga" - ako je broj strana od 301-600
        // "bas velika knjiga" - ako je broj strana 601 i vise

        String velicina;

        if (brojStrana <= 100) {
            velicina = "mala knjiga";
        }
        else if (brojStrana <= 300) {
            velicina = "srednje velika knjiga";
        }
        else if (brojStrana <= 600) {
            velicina = "velika knjiga";
        }
        else {
            velicina = "bas velika knjiga";
        }
        return velicina;
    }

    public String toString() {

        //Naziv knjige je: <naziv knjige>
        //Autor knjige je: <ime i prezime autora ako postoji, 'nepoznato' ako autor nije postavljen (null)>
        //Vlasnik knjige je: <ime i prezime vlasnika ako postoji,
        // 'knjiga nema vlasnika' ako vlasnik nije postavljen (null)>
        //Broj strana: <broj strana>
        //Godina izdanja: <godina izdanja>

        StringBuilder sb = new StringBuilder();

        sb.append("Naziv knjige je: ");
        sb.append(nazivKnjige);
        sb.append("\n");

        sb.append("Autor knjige je: ");
        if (autor != null) {
            sb.append(autor.getIme());
            sb.append(" ");
            sb.append(autor.getPrezime());
            sb.append(".\n");
        }
        else {
            sb.append("Nepoznat");
        }

        sb.append("Vlasnik knjige je: ");
        if (vlasnik != null) {
            sb.append(vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append(".\n");
        }
        else {
            sb.append("Knjiga nema vlasnika.\n");
        }

        sb.append("Broj strana je: ");
        sb.append(brojStrana);
        sb.append(".\n");

        sb.append("Godina izdanja: ");
        sb.append(godinaIzdanja);
        sb.append(".\n");

        return sb.toString();
    }
}
