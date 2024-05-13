
package Co_Verient_return_type;

class A{
    A show(){
        System.out.println("this is parent class");
        return this; //we can use return new A();
    }
}

class B extends A{
    @Override
    B show(){
        System.out.println("child class");
        return new B();
    }
}

public class Main {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
    
}
