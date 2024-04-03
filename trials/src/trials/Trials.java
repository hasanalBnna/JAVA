//12-1-22
//multiple funcion ,function overload,perameterized function,user input

package trials;
import java.util.Scanner;
class area{
    int lenght,width,redius;
    int value;
    double Area;
    int getvalue(){
       return value=lenght*width;
    }
    double getvalue(int redius){
        this.redius=redius;
        return Area=3.14*redius*redius;
    }
    void setvalue(int lenght,int width){
        this.lenght=lenght;
        this.width=width;
    }
    
}


public class Trials {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("length :");
        int l=sc.nextInt();
        System.out.print("width :");
        int w=sc.nextInt();
         System.out.print("Redius :");
         int r=sc.nextInt();
        int xt;
        double yt;
        area obj=new area();
        obj.setvalue(l, w);
       // obj.lenght=10;
       // obj.width=10;
       xt=obj.getvalue();
       yt=obj.getvalue(r);
       
        System.out.println("value :"+xt);
        System.out.println("value :"+yt);
        
  
    }
    
}
