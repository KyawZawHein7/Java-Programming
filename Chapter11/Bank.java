public class Bank {
    //Constructor
    Bank(){

    }
    //Method return interest rate
    public float getInterestRate(){
        return 0;
    }

}
//Subclass of TTB
class TTB extends Bank{
    public float getInterestRate(){
        return 8.4f;
    }
}
//sunclass SCB 
class SCB extends Bank{
    public float getInterestRate(){
        return 5.3f;
    }
}