public class Animal {
    //Data fields for Animal class
    private int age;
    private String food;

    //Default constructor
    public Animal(){

    }
    //Constructor with arguments
    public Animal(int age, String food){
        this.age = age;
        this.food = food;
    }
    //age method
    public void age(){
        System.out.println("Age: "+age);
    }
    //Food method
    public void food(){
        System.out.println("Food: "+food);
    }
    
}
