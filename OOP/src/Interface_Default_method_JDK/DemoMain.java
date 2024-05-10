
package Interface_Default_method_JDK;

interface A{
    void a1();
    void a2();
    
    default void a3(){
        System.out.println("may or may not Override in implementing class");
    }
}
class B implements A{
    @Override
    public void a1(){
        System.out.println("Class B a1()");
    }
    @Override
    public void a2(){
        System.out.println("Class B a2()");
    }
}

class C implements A{
    @Override
    public void a1(){
        System.out.println("Class C a1()");
    }
    @Override
    public void a2(){
        System.out.println("Class C a2()");
    }
}

class D implements A{
    @Override
    public void a1(){
        System.out.println("Class D a1()");
    }
    @Override
    public void a2(){
        System.out.println("Class D a2()");
    }
}

public class DemoMain {

    public static void main(String[] args) {
        B b = new B();
        b.a1();
        b.a2();
        b.a3();
        
        C c = new C();
        c.a1();
        c.a2();
        c.a3();
        
        D d = new D();
        d.a1();
        d.a2();
        d.a3();
    }
    
}
