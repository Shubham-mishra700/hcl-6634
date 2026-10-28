package Inheritance;

public class Main {
   public static void main() {

       Box box = new Box();

       System.out.println(box.l + " " + box.h + " " + box.w );

      // box.weight; parent  object cannot access child property but child object can access the parent property

       BoxWeight b = new BoxWeight();

       System.out.println(b.l + " " + b.weight);//here it can also access the property of parent class(Box);

       BoxWeight b1 = new BoxWeight(2,3,4,8);


       Box box1 = new BoxWeight();
      // System.out.println(box1.weight);//here we cannot access it because reference object is parent class and parent class cannot access the property of child class

       Box box2 = new BoxWeight(20,21,22,32);
           System.out.println(box2.w); // this can be done because w is itself instance of parent class.

     // In java multiple inheritance and hybrid inheritance is not allowed we can do using interfaces.



   }

}
