
package Interface_private;

interface A{
    private void sum(int x, int y){
        System.out.println("sum of this: "+(x+y));
    }
    default void call(){
        sum(20,10);
    }
}
class B implements A{
    public void sub(int x,int y){
        System.out.println("sum of this: "+(x-y));
    }
}
public class Main {

    public static void main(String[] args) {
        B b = new B();
        b.call();
        b.sub(200, 100);
    }
    
}
