package AccessModifier;

public class A {

   private int num;
   protected int rollno;
    String name;

    public A(int num,String name){
        this.num=num;
        this.name = name;

    }

    public A(int rollno){
        this.rollno=rollno;
    }

    public int getNum(){
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }


}
