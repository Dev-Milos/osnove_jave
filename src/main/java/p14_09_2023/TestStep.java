package p14_09_2023;

public class TestStep {
    private String opis;
    private String actualVrednost;
    private String expectedVrednost;
    private String errorMessage;

    public TestStep(String opis, String actualVrednost, String expectedVrednost, String errorMessage) {
        this.opis = opis;
        this.actualVrednost = actualVrednost;
        this.expectedVrednost = expectedVrednost;
        this.errorMessage = errorMessage;
    }


    public String getOpis() {
        return opis;
    }

    public String getActualVrednost() {
        return actualVrednost;
    }

    public String getExpectedVrednost() {
        return expectedVrednost;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean validate(){
        if (this.actualVrednost.equalsIgnoreCase(this.expectedVrednost)){
            return true;

        }else return false;
    }
    public void stampaj(){
        System.out.println("| " + this.opis + " |");
        if (validate()){
            System.out.println("| Status (passed) |");
        }else System.out.println("| Status (failed) |" + this.errorMessage);
    }
}
