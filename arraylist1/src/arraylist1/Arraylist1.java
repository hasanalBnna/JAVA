
package arraylist1;
import java.util.*;


public class Arraylist1 {


    public static void main(String[] args) {
    ArrayList<String> a1=new ArrayList<String>();
    System.out.println("size of a1;"+a1.size());
    
    a1.add("A");
    a1.add("B");
    a1.add("c");
    a1.add("D");
    a1.add("E");
    a1.add("F");
    a1.add(2, "A2");
    System.out.println("size after add:"+a1.size());
     System.out.println("content of a1:"+a1);
     Scanner sc = new Scanner(System.in);
    System.out.print("enter a number:");
        int N = sc.nextInt();
    if(N==1){
     a1.remove("D");
     a1.remove(4);
     System.out.println("size after remove:"+a1.size());
      System.out.println("content of a1:"+a1);}
    else{
     a1.removeAll(a1);//remove all
     System.out.println("size after remove:"+a1.size());
      System.out.println("content of a1:"+a1);}
    }
    
}
