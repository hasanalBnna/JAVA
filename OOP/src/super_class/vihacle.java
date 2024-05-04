
package super_class;


public class vihacle {
    
    String colour;
    double weight;
    
    
    vihacle(String c, double w){
        colour = c;
        weight = w;
    }
    
    void attribute(){
        System.out.println("Colour: "+colour);
        System.out.println("weight: "+weight);
    }
}
