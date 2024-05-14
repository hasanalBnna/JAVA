
package var_args_Method;

class A{
    void add(int ... a){
        int sum = 0;
        for (int x:a){
            sum = sum+x;
        }
        System.out.println("Sum of numbers: "+sum);
    }
}
public class Main {

    public static void main(String[] args) {
        A obj = new A();
        obj.add(10);
        obj.add(10,20);
        obj.add(10,20,30);
    }
    
}
