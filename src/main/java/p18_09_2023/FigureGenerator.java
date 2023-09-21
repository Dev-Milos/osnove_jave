package p18_09_2023;

public class FigureGenerator {
    public Figura generisiFiguru(String tipFigure){
        if (tipFigure.equals("trougao")){
            JednakostranicniTrougao trougao =new JednakostranicniTrougao();
            return trougao;
        } else if (tipFigure.equals("pravougaonik")) {
            Pravougaonik  pravougaonik = new Pravougaonik();
            return pravougaonik;
        }else return null;
    }
}
