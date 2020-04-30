public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

//    public int getSpeed() {
//        return speed;
//    }
//    public boolean isOn() {
//        return on;
//    }
//    public double getRadius() {
//        return radius;
//    }
//    public String getColor() {
//        return color;
//    }
    public Fan(){
    }
    public Fan(int speed,boolean on,double radius,String color){
        this.speed =speed;
        this.on =on;
        this.radius=radius;
        this.color =color;
    }
    public String toString(){
        String data;
        if(this.on){
            data= "quat dang mo "+ "o so "+this.speed+ " voi mau "+this.color+" va ban kinh "+this.radius;
        }else {
            data ="quat dang dong "+ "voi mau "+this.color+" va ban kinh "+this.radius;
        }
        return data;
    }
}
