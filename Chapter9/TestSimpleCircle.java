public class TestSimpleCircle {
    public static void main(String[] args) {
        //Creat and object with radius 1

       Circle circle1 =  new Circle();
       System.out.println("The area of circle1 of radius "+circle1.radius+" is "+circle1.getArea());
       Circle circle2 = new Circle(25);
       System.out.println("The area of circle2 of radius "+circle2.radius+" is "+circle2.getArea());
    }
    
}
