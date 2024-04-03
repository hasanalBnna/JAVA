
package arraylist2;
import java.util.*;

public class Arraylist2 {

   
    public static void main(String[] args) {
        ArrayList<Integer> a2=new ArrayList<Integer>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a2.add(5);
        System.out.println("elements:"+a2);
        Integer ia[]=new Integer[a2.size()];
        ia=a2.toArray(ia);
        int sum=0;
        for(int i: ia) sum+=i;
        System.out.println("sum is:"+sum);
    }
    
}
