package AbstractDemo;

//abstract means a method has no implementation and must be implemented by a subclass.

public abstract class Parent {

    public Parent(int age) {
        this.age = age;
    }

    // we can create an normal constructor but not an abstract constructor.

//although we can create an static method in abstract class but not abstract static method.

    static void hello(){
        System.out.println("hey");
    }


    int age;

    abstract void career();//if an class contain one or more than one abstract method then class must be declared as abstract.
    abstract void partner();
}

