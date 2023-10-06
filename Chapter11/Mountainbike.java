public class Mountainbike extends Bicycle{
    
    //only one datafield
    private int seatheight;

    //Constructor
    Mountainbike(int gear, int speed, int seatheight){
        super(gear, speed);
        this.seatheight = seatheight;
    }
    //Methos to set the height of the seat
    public void seatheight(int seatheight){
        this.seatheight = seatheight;
    }
    public String toString(){
        return(super.toString()+"\nseatheight is "+seatheight);
    }
}
