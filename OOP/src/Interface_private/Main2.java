
package Interface_private;

interface A{
    private static void sum(int x, int y){
        System.out.println("sum of this: "+(x+y));
    }
    public static void call(){
        sum(20,10);
    }
}
class B implements A{
    public void sub(int x,int y){
        System.out.println("sub of this: "+(x-y));
    }
}
public class Main2 {

    public static void main(String[] args) {
        B b = new B();
        A.call();
        b.sub(200, 100);
    }
    
}
