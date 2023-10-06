public class TestFan extends Fan {
    public static void main(String[] args) {
        Fan Fan1 = new Fan();
        Fan1.setRadius(10);
        Fan1.setColor("Yellow");
        Fan1.setSpeed(3);
        Fan1.setOn(true);
        System.out.println(Fan1.toString());

        Fan Fan2 = new Fan();
        Fan2.setColor("Blue");
        Fan2.setOn(false);
        System.out.println(Fan2.toString());
    }
    
}
