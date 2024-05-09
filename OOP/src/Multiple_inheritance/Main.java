
package Multiple_inheritance;

interface A{
    void show();
}

interface B{
    void show();
}

public class Main implements A,B {
    
    public void show(){
        System.out.println("implement B & B");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.show();
    }
    
}
