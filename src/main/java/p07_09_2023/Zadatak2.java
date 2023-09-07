package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

        SlackMessage slackMessage = new SlackMessage();

        slackMessage.tekstPoruke = "desi sta ima";
        slackMessage.imePrezime = "Pera Peric";
        slackMessage.datum = "10.08.2022.";

        SlackMessage slackMessage1 = new SlackMessage();

        slackMessage1.tekstPoruke = "evo nista";
        slackMessage1.imePrezime = "Milan Milanovic";
        slackMessage1.datum = "20.04.2023.";

        System.out.println(slackMessage.imePrezime + "-" + slackMessage.datum + "\n" + slackMessage.tekstPoruke);
        System.out.println(slackMessage1.imePrezime + "-" + slackMessage1.datum + "\n" + slackMessage1.tekstPoruke);





    }
}
