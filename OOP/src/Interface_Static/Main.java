
package Interface_Static;

interface A{
    public static void show(){
        System.out.println("parent class ,static");
    }
}

class Demo implements A{
//    @Override
    public static void show(){
        System.out.println("Error");
    }
}

public class Main {

    public static void main(String[] args) {
        A.show();
        Demo d =new Demo();
        d.show();
    }
    
}
