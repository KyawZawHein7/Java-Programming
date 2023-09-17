public class CircleWithPrivateValues {
    private double radius = 1;
    private static int numberofObjects = 0;

    public CircleWithPrivateValues(){
        numberofObjects++;

    }
    public CircleWithPrivateValues(double newradius){
        radius = newradius;
        numberofObjects++;
    }

    //Return the radius
    public double getradius(){
        return radius;
    }
    //set the radius value
    public void setRadius(double newradius){
        radius = newradius;
    }
    //Return number of objects
    public static int getNumberOfObjects(){
        return numberofObjects;
    }
    public double getarea(){
        return radius*radius*Math.PI;
    }
    
}
