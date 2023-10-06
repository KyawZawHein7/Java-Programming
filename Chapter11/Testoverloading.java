public class Testoverloading {
    //Main
    public static void main(String[] args) {
    }
    
}
class B{
    public void p(double i){
        System.out.println("class B method is "+i*2);
    }
}
class A extends B{
    public void p(double i){
        System.out.println("class A method "+i);
    }
}
