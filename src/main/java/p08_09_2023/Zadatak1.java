package p08_09_2023;



public class Zadatak1 {
    public static void main(String[] args) {
        SlackMessage slackMessage = new SlackMessage();

        slackMessage.tekstPoruke = "desi sta ima";
        slackMessage.imePrezime = "Pera Peric";
        slackMessage.datum = "10.08.2022.";

        SlackMessage slackMessage1 = new SlackMessage();

        slackMessage1.tekstPoruke = "evo nista";
        slackMessage1.imePrezime = "Milan Milanovic";
        slackMessage1.datum = "20.04.2023.";

        slackMessage.stampajPodatke();
        slackMessage1.stampajPodatke();

        slackMessage.azuriranjePoruka("desi legendo", " 08/09/2023");
        slackMessage1.azuriranjePoruka("kako ide", " 08/09/2023 ");

        slackMessage.stampajPodatke();
        slackMessage1.stampajPodatke();



    }
}
