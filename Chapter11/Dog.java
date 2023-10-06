public class Dog extends Animal{
    //Data field of dog class
    private String name;

    //Constructor 
    Dog(int age, String food, String name){
        super(age, food);
        this.name = name;
    }
    
    //name method of dog class
    public void name(){
        System.out.println("Name of the animal is "+name);
    }
    //Sound method of dog class
    public void sound(){
        System.out.println("The sound of the animal is barking");
    }
}
