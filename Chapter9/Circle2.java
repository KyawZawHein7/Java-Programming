public class Circle2 {

    //data fields

    double radius;

    //The number of objects 
    static int numberofobjects = 0;

    Circle2(){
        radius =1;
        numberofobjects++;
    }

    static int numberofobjects(){
        return numberofobjects;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
    
    
}
