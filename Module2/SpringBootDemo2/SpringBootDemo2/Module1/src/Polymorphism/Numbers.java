package Polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }

    int sum(int a,int b,int c){
        return a+b+c;
    }

   public static void main() {
        Numbers obj = new Numbers();
       System.out.println(obj.sum(2,4));

    }
}
