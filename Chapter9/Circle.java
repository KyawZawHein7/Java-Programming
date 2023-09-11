public class Circle {
    double radius; // this is data field

    // Constructor of the circle
    Circle(){
        radius =1;
    }
    //Constructor with argument
    Circle ( double newRadius){
        radius = newRadius;
    }

    //Return area of the circle
    double getArea(){
        return radius* radius* Math.PI;
    }

    //Return the parameter of the circle

    double getPerimeter(){
        return 2 *Math.PI*radius;
    }

    //Set a new Radius

    void setRadius(double newRadius){
        radius = newRadius;
    }
    
}
