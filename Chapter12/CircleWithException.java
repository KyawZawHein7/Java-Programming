public class CircleWithException {
    //The data fields
    private double radius;
    public static int numberOfObjects = 0;

    //Constructor 
    public CircleWithException(){
        this.radius = 1;
    }

    //Constructor with argument

    public CircleWithException(double newRadius){
        setRadius(newRadius);
        numberOfObjects++;
    }
    public void setRadius(double newRadius) throws IllegalArgumentException{
        if(newRadius > 0){
            radius = newRadius;
        }
        else
        throw new IllegalArgumentException("Radius cannot be negative");
    }
    public double getRadius(){
        return radius;
    }
    public static int getnumberofobjects(){
        return numberOfObjects;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    
}
