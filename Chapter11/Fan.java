public class Fan {
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    Fan(){
        speed = 1;
        radius = 5;
        color = "White";
       boolean on = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (on == true){
            return("The speed of fan1 is "+speed+"\n"+"The fan1 color is "+color+"\n"+"The fan1 radius is "+radius+"\n"+"The fan1 is on");
        }
        else
        return("The fan2 color is "+color+"\n"+"The fan2 radius is "+radius+"\n"+"The fan2 is off");

    }

    
}
