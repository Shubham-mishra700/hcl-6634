package final_keyword;

    
    class Student {
    String name;

    // Constructor
    Student(String name) {
        this.name = name;
    }
}


public class finalObject {
    public static void main(String[] args) {
        final Student s = new Student("Shubham");
        // when a non primitve is final you cannot reassign it.

        s.name = "Rahul";             // Allowed
        // s = new Student("Aman");  // Error

        System.out.println(s.name);
    }
}

/*
whats actually happned?

1)new Student("Shubham") creates an object and initializes its name through the constructor.

2)final Student s prevents s from referring to another object.

3)s.name = "Rahul" is allowed because the name field itself is not final.

*/

