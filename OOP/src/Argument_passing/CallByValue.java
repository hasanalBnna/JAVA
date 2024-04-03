
package Argument_passing;


public class CallByValue {
    void call(int i){
        i = 20;
    }
    
    public static void main(String[] args){
        
        CallByValue c = new CallByValue();
        int x= 10;
        
        c.call(x);
        System.out.println(x);
    } 
    
}
