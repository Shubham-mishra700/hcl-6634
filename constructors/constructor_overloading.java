package constructors;

public class constructor_overloading {
    
    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person("shubham",23);
        Person p3 = new Person(23);

        p1.display();
        p2.display();
        p3.display();
        
    }
}

class Person{
    String name;
    int age;


    /*What is constructor overloading and why it is used?

     Constructor overloading means having multiple constructors in the same class with different parameter lists.And is used to create  objects in different ways.
    
    */

    Person(){
        name = "unknown";
        age =0;
    }

    Person(String name,int age){

        this.name = name;
        this.age = age;

    }

    Person(int age){
        this.age = age;
    }

    void display(){
        System.out.println(name + " " + age);
    }
}
