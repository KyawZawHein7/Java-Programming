public class MonkeyDLuffu extends Animal {
    private String name;
    MonkeyDLuffu(int age, String food, String name){
        super(age, food);
        this.name = name;
        
    }
    public void name(){
        System.out.println("Name :" +name);
    }
    public void sound(){
        System.out.println("Always shouting zoro");
    }
    
}
