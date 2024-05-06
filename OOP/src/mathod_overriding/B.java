
package mathod_overriding;

public class B extends A {
    
    
    @Override
    void draw(){
        super.draw();
        System.out.println("B class printed");
    }
}
