package p19_09_2023;

import java.util.ArrayList;

public class Disciplina {
    private String imeDiscipline;
    private String tipDiscipline;
    private ArrayList<Atleticar> atleticari;

    public Disciplina(String imeDiscipline, String tipDiscipline) {
        this.imeDiscipline = imeDiscipline;
        this.tipDiscipline = tipDiscipline;
        this.atleticari = new ArrayList<>();
    }

    public Disciplina() {
    }

    public String getImeDiscipline() {
        return imeDiscipline;
    }

    public void setImeDiscipline(String imeDiscipline) {
        this.imeDiscipline = imeDiscipline;
    }

    public String getTipDiscipline() {
        return tipDiscipline;
    }

    public void setTipDiscipline(String tipDiscipline) {
        this.tipDiscipline = tipDiscipline;
    }

    public ArrayList<Atleticar> getAtleticari() {
        return atleticari;
    }



    public void dodajAtleticara(Atleticar atleticar) {
        this.atleticari.add(atleticar);
    }

    public void diskvalifikuj(String imePrezime) {
        for (int i = 0; i < this.atleticari.size(); i++) {
            if (this.atleticari.get(i).getImePrezime().equals(imePrezime)){
                this.atleticari.remove(i);
            }
        }
    }

    private Atleticar najbolji(){
        if (this.atleticari.isEmpty()){
            Atleticar najboljiAtleticar = this.atleticari.get(0);

            for (int i = 0; i < this.atleticari.size(); i++) {
                if (this.atleticari.get(i).boljiAtleticar(najboljiAtleticar)){
                    najboljiAtleticar = this.atleticari.get(i);
                }
            }
            return najboljiAtleticar;
        }
        else {
            return null;
        }
    }


}
