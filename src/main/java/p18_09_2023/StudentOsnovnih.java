package p18_09_2023;

public class StudentOsnovnih extends Student{

    @Override
    public int cenaSkolarine() {
        return 90000;
    }

    @Override
    public boolean budzet() {
        if (this.godStudija < 5){
            return true;
        }else return false;
    }
}
