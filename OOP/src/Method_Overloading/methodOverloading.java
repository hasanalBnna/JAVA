
package Method_Overloading;


public class methodOverloading {
    void add(int a, int b){
        System.out.println(a+b);
    }
    
    void add(double a, double b){
        System.out.println(a+b);
    }
    
    void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    void add(){
        System.out.println("there is no method");
    }
    
}
