public class Testpassobject {
    public static void main(String[] args) {
        //Creat a circle with radius 1
        CircleWithPrivateValues myCircle = new CircleWithPrivateValues();

        //Print aeras for radius 1, 2, 3, 4, 5
        int n =5;
        printAreas(myCircle,n);
    }
    
    public static void printAreas(CircleWithPrivateValues
    c, int times){
        System.out.println("Radius\t\tArea");
        while(times>=1){
            System.out.println();

        }
    }
}
