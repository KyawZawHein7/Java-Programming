public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println("The area of r1 of with "+r1.width+" and height "+r1.height+" of area is "+r1.getarea());
        System.out.println("The perimeter of r1 of with "+r1.width+" and height "+r1.height+" of area is "+r1.getPerimeter());
        Rectangle r2 = new Rectangle(4.5,3.5);
        System.out.println("The area of r2 of with "+r2.width+" and height "+r2.height+" of area is "+r2.getarea());
        System.out.println("The area of r2 of with "+r2.width+" and height "+r2.height+" of area is "+r2.getPerimeter());
    }
    
}
