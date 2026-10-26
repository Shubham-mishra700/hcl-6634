package AbstractDemo;

public class Daughter extends Parent {

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to become doctor");
    }

    @Override
    void partner() {
        System.out.println("I love people with good heart");
    }
}
