package p08_09_2023;

public class SlackMessage {
    public String tekstPoruke;
    public String imePrezime;
    public String datum;
    public String lastUpdateAt;

    public void stampajPodatke(){
        System.out.println(this.imePrezime + this.datum);
        System.out.println(this.tekstPoruke);
    }
    public void azuriranjePoruka (String noviTekst, String updatedAt){
        this.tekstPoruke = noviTekst;
        this.datum = updatedAt;
    }
}
