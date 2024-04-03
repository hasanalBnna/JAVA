
package oop;

/**
 *
 * @author Banna
 */
public class main {

    
    public static void main(String[] args) {
    
        constructor c1= new constructor("Abdullah", "male", 1781474908);
        //c1.setInfo("Abdullah", "male", 1781464706);
        c1.displayInfo();
        
        constructor c2= new constructor("Muhammad", "male", 1781474909);
        //c2.setInfo("Muhammad", "male", 1781474909);
        c2.displayInfo();
        
        constructor c3= new constructor();
        c3.displayInfo();
        
    }
    
}
