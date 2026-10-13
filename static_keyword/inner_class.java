package static_keyword;

public class inner_class {
     //outer class can never be static
    static class Test{//here as this depend on outer class we have to use static
             String name;

           Test(String name){
            this.name = name;
           }

    }
 

    public static void main(String[] args) {
        Test a = new Test("shubham");
        Test b = new Test("vivek");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
