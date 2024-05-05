
package mathod_overloading;

public class A {
    int add(){
        int a=10, b=20;
        int c = a+b;
        return c;
    }
    
    void add(int x, int y){
        int c = x+y;
        System.out.println("Second c: "+c);
    }
    
    void add(int x, double y){
        double c = x+y;
        System.out.println("third c: "+c);
    }
}
