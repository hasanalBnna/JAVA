
package overloading_constructor;

/**
 *
 * @author Banna
 */
public class constructor {
    String name, gender;
    int phone;
    
    constructor(){
        System.out.println("No Constructor");
    }
    
    constructor(String m, String n){
        name=m;
        gender=n;
    }
    
    constructor(String m, String n, int o){
        name=m;
        gender=n;
        phone=o;
    }
    
    void disInfo(){
        System.out.println("name:"+name);
        System.out.println("gender:"+gender);
        System.out.println("phone:"+phone);
        System.out.println("\n\n");
    }
}
