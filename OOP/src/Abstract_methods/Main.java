
package Abstract_methods;

abstract class programming{
    public abstract void developer();
}

class HTML extends programming{
    @Override
    public void developer(){
        System.out.println("Tim Berners Lee");
    }
}

class JAVA extends programming{
    @Override
    public void developer(){
        System.out.println("James Gosling");
    }
}

public class Main {

    public static void main(String[] args) {
        
        programming h = new HTML();
        h.developer();
        
        programming j = new JAVA();
        j.developer();
    }
    
}
