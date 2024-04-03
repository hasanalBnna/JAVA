
package Argument_passing;


public class CallByReference {
    String name;
    void call(CallByReference r2){
        r2.name = "abdul";
    }
    
    public static void main(String[] args){
        
        CallByReference r1 = new CallByReference();
        r1.name = "kuddus";
        System.out.println("before calling: "+r1.name);
        
        r1.call(r1);
        System.out.println("after calling: "+r1.name);
    }
    
}
