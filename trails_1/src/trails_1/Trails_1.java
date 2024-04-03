
package trails_1;
class parents{
    int a,b,c;
    void func(int a,int b,int c){
       this.a=a;
       this.b=b; 
        this.c=c;
       
    }
}


public class Trails_1 extends parents{

    public static void main(String[] args) {
        int d,f,g,h,i,sum;
        parents obj=new parents();
        System.out.print("enter a: ");
        d=obj.a;
         System.out.print("enter b: ");
        f=obj.b;
         System.out.print("enter c: ");
        g=obj.c;
        sum=d+f+g;
        //h=obj.func(10,20,30);
        
        System.out.println("sum :"+sum);
        
      //  obj.b=20;
       // obj.c=30;
        ;
        //obj.a=1
        
   
    }
    
}
