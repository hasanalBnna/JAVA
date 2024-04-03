package findprime;
import java.util.*;
import java.lang.Math;
/**
 * 17.01.2022
 * @Rinzler @Tareque
 */
public class FindPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N;
        int flag=0,countLoops =0;
        System.out.print("Enter a Number : ");
        N = sc.nextLong();
        double sqrtN = Math.sqrt(N);
        int i=3;
        if(N%2==0){
            System.out.println("Not Prime");
            System.out.println("Devident = 2");
        }
        else if(N%10==5){
            System.out.println("Not Prime");
            System.out.println("Devident = 5");
        }
        else{            
            while(i<=sqrtN){
                if(N%i==0){
                    flag=1;
                    break;
                }
                else {
                    flag=0;
                }
                i=i+2;
                countLoops++;
                if(i%5==0){
                    i=i+2;
                }
                else if(i%3==0){
                    i=i+2;
                }
            }
        }
        if(flag==1){
            System.out.println("Not Prime");
            System.out.println("Devident = "+i);
        }
        else{
            System.out.println("Prime!!");
        }       
        System.out.println("Total Loop Needed = "+countLoops);
    }    
}
