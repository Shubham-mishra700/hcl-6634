package constructors;

public class constructor {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("shubham",23,"delhi");

        // why do we even need constructor ?

        /* 
     Because when a class has multiple properties and we create multiple objects, assigning values to each property separately can be repetitive. A constructor allows us to initialize an object's properties directly when creating the object, making the code cleaner and easier to manage.
        */
       
     e1.display();

    }

}

class Employee{

    String empName;
    int age;
    String city;

    Employee(String empName,int age,String city){
        this.empName=empName;
        this.age = age;
        this.city=city;
    }

    void display(){
        System.out.println(" Name is "+empName+" having age "+age+" living in "+city);
    }
   
}
