
package mathod_overloading;

public class Main {

    public static void main(String[] args) {
        
        A ob = new A();
        ob.add(100, 200);
        ob.add(40, 50.43);
        System.out.println("first c: "+ob.add());
    }
    
}
