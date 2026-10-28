package AccessModifier;

public class Main {
    static void main() {
        A obj = new A(23,"shubham");
        // we cannot access num as it is declared as private in other class; hence we can do using getter and setter.

        System.out.println(obj.getNum());
        obj.setNum(34);
        System.out.println(obj.getNum());

        A obj1 = new A(1);


        System.out.println(obj1.rollno);//so we can access protected member in same class as well as in different class of same package.


    }
}
