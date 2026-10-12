package task;

import java.util.*;

/*Task :  create an arraylist of employee type and apply crud operation on the employee object use iterator and list iterator both to traverse the employees apart from these we need to iterate these employees on the decreasing and increasing order*/

class Employee{
    int empId;
    String empName;
    double salary;


    Employee(int empId,String empName,double salary){
    this.empId= empId;
    this.empName=empName;
    this.salary=salary;
}
}



public class EmployeeCrud {
    
    public static void main(String[] args) {
        
        ArrayList<Employee>list = new ArrayList<>();

        list.add(new Employee(1,"shubham" , 10000));
        list.add(new Employee(2,"aman" ,  23000));

        for(Employee e:list){
            System.out.println(e.empId + " " + e.empName + " " + e.salary);
        }

        for(int i=0;i<list.size();i++){
           if(list.get(i).empId ==1){
            list.get(i).salary = 150000;
           }
        }

        System.out.println("Updated salary");

        
        for(Employee e:list){
            System.out.println(e.empId + " " + e.empName + " " + e.salary);
        }

        // Delete using normal method

        // suppose we want to delete emp aman

     /*    for(int i=0;i<list.size();i++){
            if(list.get(i).empId==2){
                list.remove(i);
            }
        }
  
        System.out.println("Remaining  employee");


        
        for(Employee e:list){
            System.out.println(e.empId + " " + e.empName + " " + e.salary);
        }*/


          // DELETE using Iterator
        Iterator<Employee> it = list.iterator();

          while (it.hasNext()) {
          Employee e = it.next();

       if (e.empId == 2) {
         it.remove();
         System.out.println("Employee deleted");
         break;
     }
}





    }
}
