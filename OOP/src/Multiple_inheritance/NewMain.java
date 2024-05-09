
package Multiple_inheritance;

interface A{
    void show();
}

interface B{
    void display();
}

public class NewMain implements A,B {
    @Override
    public void show(){
        System.out.println("implement A");
    }
    
    @Override
    public void display(){
        System.out.println("implement B");
    }

    public static void main(String[] args) {
        NewMain nm = new NewMain();
        nm.show();
        nm.display();
    }
    
}
