
package Interface_Methods;

interface client{
    void webDesign();
    void webDevelopment();
}

abstract class ATech implements client{
    @Override
    public void webDesign(){
        System.out.println("HTML, CSS, JavaScript");
    }
}

class BTech extends ATech{
    @Override
    public void webDevelopment(){
        System.out.println("Green, Top Menu, Three Dots");
    }
}

public class Main {

    public static void main(String[] args) {
//        client c = new BTech(); // we can use those reference variable
//        ATech c = new BTech();
        BTech c =new BTech();
        c.webDesign();
        c.webDevelopment();
    }
    
}
