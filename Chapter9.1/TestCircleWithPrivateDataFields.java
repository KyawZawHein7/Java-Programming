public class TestCircleWithPrivateDataFields {
    public static void main(String[] args) {
        CircleWithPrivateValues mycircle = new CircleWithPrivateValues(5.0);
        System.out.println("The area of the circle with "+mycircle.getradius());
        mycircle.setRadius(mycircle.getradius()*1.1);
        System.out.println("The area of the circle with "+mycircle.getradius()*1.1);
        System.out.println("The number of objects created are "+CircleWithPrivateValues.getNumberOfObjects());
    }
    
}
