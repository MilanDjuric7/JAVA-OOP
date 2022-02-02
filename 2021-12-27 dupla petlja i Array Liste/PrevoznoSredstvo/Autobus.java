package Domaci.domaci_27_12_2021.PrevoznoSredstvo;

public class Autobus extends PrevoznoSredstvo{

    private int maksimalanBrojputnika;

    public Autobus(int godinaProizvodnje, String zemljaProizvodnje, String marka,
                   int maksimalanBrojputnika) {
        super(godinaProizvodnje, zemljaProizvodnje, marka);
        this.maksimalanBrojputnika = maksimalanBrojputnika;
    }

    public int getMaksimalanBrojputnika() {
        return maksimalanBrojputnika;
    }

    public void setMaksimalanBrojputnika(int maksimalanBrojputnika) {
        this.maksimalanBrojputnika = maksimalanBrojputnika;
    }

    public void sirena() {
        System.out.println("dum dum");
    }
}
