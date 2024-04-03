
package overloading_constructor;

/**
 *
 * @author Banna
 */
public class Main {

    public static void main(String[] args) {
    
        constructor c1= new constructor();
        
        
        constructor c2= new constructor("Abdullah","male", 178243567);
        c2.disInfo();
        
        constructor c3= new constructor("Muhammad","male");
        c3.disInfo();
    }
    
}
