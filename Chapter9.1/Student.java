public class Student {
    private String Name;

    //Set method to set name
    // public void setName(String newName){
    //     Name = newName;
    // }

    public Student(String Name){
        this.Name = Name;
    }

    public void setName(String Name){
        this.Name= Name;
    }
    public Student(){
        this("Kyaw Zaw Hein");
    }
    
}
