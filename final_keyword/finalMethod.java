package final_keyword;


    class Parent {
    final void display() {
        System.out.println("Parent display");
    }

    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    // Cannot override display() because it is final

    @Override
    void show() {
        System.out.println("Child show");
    }
}

public class finalMethod  {
    public static void main(String[] args) {
        Child c = new Child();

        c.display();  // Inherited from Parent
        c.show();     // Overridden in Child
    }
}

