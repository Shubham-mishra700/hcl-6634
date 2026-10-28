package Encapsulation;

import AccessModifier.A;
public class SubClass extends A{
    public SubClass(int rollno) {
        super(rollno);
    }

    static void main() {
        SubClass obj = new SubClass(3);
        System.out.println(obj.rollno); // therefore protected is also accesible in different package subclass.

    }
}
