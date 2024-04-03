
package oop;

/**
 *
 * @author Banna
 */
public class constructor {
    String name, gender;
    int phone;
    
    constructor(String m, String n, int o){
        name=m;
        gender=n;
        phone=o;
    }
    constructor(){
        System.out.println("No Constructor");
    }
    
    void displayInfo(){
      System.out.println("name:"+name);
      System.out.println("gender:"+gender);
      System.out.println("phone number:"+phone); 
      System.out.println("\n");
    }
}
