package Polymorphism;

public class Shapes {
    void area(){
        System.out.println("I am in shapes");
    }

    // hence if we apply final keyword in front of void it will not allow overriding.

    // overriding depends on object
    //  static does not depend on object
    // static method cannot be overridden.

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//   final void area(){
//        System.out.println("I am in shapes");
//    }
}
