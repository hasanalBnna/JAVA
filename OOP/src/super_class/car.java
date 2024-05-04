
package super_class;

public class car extends vihacle {
    
    int gare;
    
    car(String c, double w, int g){
        super(c, w);
        gare = g; 
    }
    
    @Override
    void attribute(){
        super.attribute();
        System.out.println("gare: "+gare);
    }
}
