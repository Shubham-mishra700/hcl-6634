public class overriding {
    public static void main(String[] args) {
        
        Dog d = new Dog();
        d.sound();
    }
}


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


/*

 why overriding?

 Imagine you have many animals. Without overriding, you might need different method names, such as  dogSound(), catSound(), and cowSound().
 With overriding, each class can use the same method name, sound(), but provide its own behavior.

*/

class Dog extends Animal {
    @Override
    void sound() {
      
        System.out.println("Dog barks");
    }
}


