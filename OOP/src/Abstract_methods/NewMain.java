
package Abstract_methods;

abstract class programming{
    public abstract void developer();
    public abstract void rank();
}

class HTML extends programming{
    @Override
    public void developer(){
        System.out.println("Tim Berners Lee");
    }
    
    @Override
    public void rank(){
        System.out.println("3rd");
    }
}

class JAVA extends HTML{
    @Override
    public void developer(){
        System.out.println("James Gosling");
    }
}

public class NewMain {

    public static void main(String[] args) {
        
        programming h = new HTML();
        h.developer();
        h.rank();
        
        programming j = new JAVA();
        j.developer();
    }
    
}
