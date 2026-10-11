package packages.packageB;

import packages.packageA.Greeting;;

public class Message {
    public static void main(String[] args) {
        Greeting g1 = new Greeting();
        g1.display();
    }
}

/*

what are packages?

"Packages in Java help us organize related classes, avoid naming conflicts, control access, and improve code reusability. We can access classes from other packages using the import statement, provided the access rules allow it." 

Important conditions
1. Class must be accessible: A class in another package generally needs to be declared public.
2. Method must be accessible: The method should also be public if you want to call it from another package.
3. Use import: Import the class you want to use, or use its fully qualified name.
4. Create an object if needed: For a non-static method, create an object. For a static method, use the class name.

*/