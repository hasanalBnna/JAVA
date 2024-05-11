
package Interface_Static;

interface A{
    public static void show(){
        System.out.println("parent class ,static");
    }
}

class Demo implements A{
//    @Override //static methods can't override. can't use override annotation 
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
