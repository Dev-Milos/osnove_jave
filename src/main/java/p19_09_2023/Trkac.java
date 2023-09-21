package p19_09_2023;

public class Trkac extends Atleticar{
    public Trkac(String imePrezime, int rezultat) {
        super(imePrezime, rezultat);
    }

    public Trkac() {
    }

    @Override
    public boolean boljiAtleticar(Atleticar atleticar) {
        if ( this.rezultat < atleticar.rezultat){
            return true;
        }else return false;
    }


}
