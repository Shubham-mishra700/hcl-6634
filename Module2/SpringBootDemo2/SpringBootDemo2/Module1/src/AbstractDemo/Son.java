package AbstractDemo;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println(" I am going to be very rich");
    }

    @Override
    void partner() {
        System.out.println("i love my mom ");
    }
}
