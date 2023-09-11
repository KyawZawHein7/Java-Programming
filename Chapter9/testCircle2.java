public class testCircle2 {
    public static void main(String[] args) {
        System.out.println("Before creating objects");
        System.out.println("The number of objects are "+Circle2.numberofobjects);

        //Create object1
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2();
        System.out.println("After creating the circle object "+c1.numberofobjects+" "+ c2.numberofobjects);
    }
    
}
