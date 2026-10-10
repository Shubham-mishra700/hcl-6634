package method_overloading_overriding;

public class overloading {
    
    public static void main(String[] args) {
        
        Calculator c = new Calculator();
        System.out.println(c.add(2,3, 0));
        System.out.println(c.add(2,5));
        System.out.println(c.add(2,5,6,7));
    }
}

//without overloading

/*class Calculator {

    int addTwo(int a, int b) {
        return a + b;
    }

    int addThree(int a, int b, int c) {
        return a + b + c;
    }
}*/


//with overloading 

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

/*
 why method overloading ?
 Method overloading improves code readability and usability by allowing methods with the same name to perform similar operations with different parameters. It reduces the need for multiple method names and supports compile-time polymorphism.
*/