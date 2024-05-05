
package Final_keyword;

public class university {
    
    final String UNIVERSITY_NAME = "BUBT"; //final variable
    final int fees; //blank final variable
    static final String rank; //static blank final variable
    
    university(){
        fees = 27000;
    }
    
    static{
        rank = "13th"; 
    }
    
    void display(){
        System.out.println("UNIVERSITY_NAME: "+UNIVERSITY_NAME);
        System.out.println("Fees: "+fees);
        System.out.println("Rank: "+rank);
    }
    
    
}
