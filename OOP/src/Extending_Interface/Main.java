
package Extending_Interface;

interface abdullah{
    void add();
}

interface banna extends abdullah{
    void sub();
}

public class Main implements banna {
    
    @Override
    public void add(){
        int a = 20, b=10,c ;
        c = a +b;
        System.out.println("Sum of a+b ="+c);
    }
    
    @Override
    public void sub(){
        int a = 20, b=10,c ;
        c = a -b;
        System.out.println("Sub of a-b ="+c);
    }

    public static void main(String[] args) {
        
        banna b = new Main();
        b.add();
        b.sub();
    }
    
}
