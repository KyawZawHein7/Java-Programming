public class ArrayofObjects {
    public static void main(String[] args) {
        CircleWithPrivateValues [] CircleArray = new CircleWithPrivateValues[5];
        System.out.println(CircleArray.length);
        for(int i= 0; i<CircleArray.length;i++){
            CircleArray[i]=new CircleWithPrivateValues (Math.random()*10);
        }

        //Print circle array 
        printCircleArray(CircleArray);
    }

    public static void printCircleArray(CircleWithPrivateValues[]CircleArray){
        System.out.printf("%-30s%-15s\n","radius","area");
        for(int i= 0; i< CircleArray.length; i++){
            System.out.printf("%-30s%-15s\n",CircleArray[i].getradius(),CircleArray[i].getarea());
        }
    }
    
}
