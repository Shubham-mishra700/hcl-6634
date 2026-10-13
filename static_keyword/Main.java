package static_keyword;

public class Main {
    static int  a;
    int b;
    static void fun(){
            
        System.out.println("fun");
    }

     void greeting(){
        fun();
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        
       /*   Human h1 = new Human(23,"shub", 12222);
         Human h2 = new Human(23,"mishra", 1222);

        System.out.println(Human.population);
        System.out.println(Human.population);*/

         Main obj = new Main();
         obj.greeting();
        //  obj.fun();
         Main.fun();
         System.out.println(obj.b);

      
     /*     Main obj = new Main();
         obj.greeting();*/

        /*greeting();*///here it is showing error because we cannot access non static method inside the static method.

        /* Therefore we can access it by two ways one is to make the method static and other one is to create an object. */
    }

  /*   static void fun(){
        greeting();//cannot access
    }*/

        

        

   
}
