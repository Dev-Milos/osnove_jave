package p14_09_2023;

import java.util.ArrayList;

public class TestCase {
    private String ID;
    private String naziv;
    private ArrayList<TestStep>TestSteps;

    public TestCase(String ID, String naziv) {
        this.ID = ID;
        this.naziv = naziv;
        this.TestSteps = new ArrayList<>();
    }

    public String getID() {
        return ID;
    }

    public String getNaziv() {
        return naziv;
    }

    public ArrayList<TestStep> getTestSteps() {
        return TestSteps;
    }
    public void addTestStep(TestStep testStep){
        this.TestSteps.add(testStep);
    }
    public double failedTestStepNumber(){
        double testFailed = 0;
        for (int i = 0; i < TestSteps.size(); i++) {
            if (!this.TestSteps.get(i).validate()){
                testFailed++;
            }
        }
        return testFailed;
    }
    public String PassOrFail(TestStep TestStep){
        if (failedTestStepNumber()>0){
            return "Failed";
        }else return "Passed";
    }
    public void stampajTestCase(){
        double counter = 0;
        System.out.println(this.ID + " - " +this.naziv);
        for (int i = 0; i < this.TestSteps.size(); i++) {
            TestSteps.get(i).stampaj();
            if (!this.TestSteps.get(i).validate()){
                counter++;
            }
        }
        System.out.println(this.TestSteps.size() + " " + counter);
        if (counter>1){
            System.out.println("Failed");
        }else System.out.println("Passed");
    }
}
