
package Interface;

import java.util.Scanner;

interface client{
    void input();
    void output();
}

class banna implements client{
    String name;
    double sal;

//    @Override
    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter name: ");
        name= r.nextLine();
           
        System.out.println("Enter Salary: ");
        sal= r.nextDouble();
    }

//    @Override
    public void output() {
        System.out.println(name +" "+sal);
    }
    
}

public class Main {

    public static void main(String[] args) {
        
        client c = new banna();
        c.input();
        c.output();
    }
    
}
