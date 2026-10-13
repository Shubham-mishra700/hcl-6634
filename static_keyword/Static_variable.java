package static_keyword;

class Human{
    int age;
    String name;
    int salary;
   // long population;
   static long population; // as it is satic it will not depend on object as it will only depend on class Human.

    Human(int age,String name,int salary){
        this.age=age;
        this.name = name;
        this.salary=salary;
        Human.population+=1;
    }


}
