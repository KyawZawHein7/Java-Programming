public class Employee {
    String Name;
    int age;
    double Salary;
    double increment;

    //Constructor of the Employee class
    Employee(String newName, int newAge, double newincrement){
        Name = newName;
        age = newAge;
        //Salary = newSalary;
        increment = newincrement;
    }

    String getname(){
        return Name;
    }
    double getsalary(){
        return Salary;
    }

    double getincrement(){
        double increment = Salary+ Salary*0.05;
        return increment;
    }

}
