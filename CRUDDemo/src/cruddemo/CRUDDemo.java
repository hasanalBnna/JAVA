
package cruddemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
class Employee{
    private int empno;
    private String ename;
    private int salary;
    Employee(int empno,String ename,int salary){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
    }
        public int getEmpno(){
            return empno;
        }
        public String getEname(){
            return ename;
        }
        public int getSalary(){
            return salary;
        }
        public String toString(){
            return empno+" "+ename+" "+salary;
        }
        
    }

  

public class CRUDDemo {


    public static void main(String[]args) {
        
        Collection <Employee> c = new ArrayList<Employee>();
       Scanner s =new Scanner(System.in);
       int ch = 0;

       do{
          System.out.println("1.INSERT"); 
          System.out.println("2.DISPLAY");
          System.out.println("3.SEARCH"); 
          System.out.println("4.DELETE");
          System.out.println("5.UPDATE");
          System.out.print("Enter Your Choice : ");
          ch=s.nextInt();
          switch(ch){
              case 1:
                 
                  System.out.println("Enter Empno : ");
                  int eno=s.nextInt();
                  System.out.println("Enter EmpName : ");
                  String ename=s.nextLine();
                  System.out.println("Enter Salary : ");
                  int salary=s.nextInt();
                  
                  c.add(new Employee(eno,ename,salary));
                  break;
                }
       }while(ch!=0);
    }
    
}
