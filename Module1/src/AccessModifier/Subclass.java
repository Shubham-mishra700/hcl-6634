package AccessModifier;

public class Subclass extends A{

    public Subclass(int rollno) {
        super(rollno);
    }

    static void main() {
        Subclass obj = new Subclass(2);
        System.out.println(obj.rollno); // therefore protected is also accessed in subclass of same package.And one important point is that in other package subclass can only access it not like A.rollno
    }
}
