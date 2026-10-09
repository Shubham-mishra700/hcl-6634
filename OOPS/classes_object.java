package OOPS;

class classes_object {
 
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "shubham";
        s1.age = 23;

        s1.study();
        s1.play();

    }
    
}

  //classes is a user-defined data types. They allow developers to go beyond primitive data types (like integers, floats, and booleans) by bundling together multiple variables of different data types alongside the methods that operate on them.

    class Student{
        String name;
        int age;

        void study(){
            System.out.println(name + " is studing");
        }

        void play(){
            System.out.println(name + " having age " + age + " is playing");
        }


    }

    // why do we need classes and objects?

   /*  A class groups related data and methods into one unit, while an object allows us to use that data and methods.

   For example, in a Student class, we can store a student's name and age and define methods like study() and play(). We can create multiple Student objects, each with different data.
   This makes our code reusable, organized, and easier to maintain."*/