package p18_09_2023;

public class StudentMaster extends Student{
    @Override
    public int cenaSkolarine() {
        return 100000;
    }

    @Override
    public boolean budzet() {
        if (this.godStudija<2){
            return true;
        }else return false;
    }
}
