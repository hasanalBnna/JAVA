
package Veriable_length_argument;


public class veriableDemo {
    void add(int ... num){
        int sum=0;
        for(int x : num){
            sum= sum+x;        
        }
        System.out.println(sum);
    }
    
}
