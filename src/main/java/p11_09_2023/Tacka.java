package p11_09_2023;

public class Tacka {
    private String x;
    private String y;
    public void stampaj(){
        System.out.println(this.x + this.y);
    }
    public Tacka(){

    }
    public Tacka(String x, String y){
        this.x = x;
        this.y = y;
    }
    public String getX(){
        return x;
    }
    public void setX(String newX){
        this.x = newX;
    }
    public String getY(){
        return y;
    }
    public void setY(String newY){
        this.y = y;
    }
}
