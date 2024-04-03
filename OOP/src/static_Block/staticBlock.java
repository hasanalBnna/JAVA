
package static_Block;


public class staticBlock {
   static int id;
   static String name;
   
   static{
    id=101;
    name="banna";
}
    void display1(){
        System.out.println("this is non-static");
       System.out.println("Id: "+id);
       System.out.println("Name :"+name);
   }
    
    static void display2(){
        System.out.println("this is static");
       System.out.println("Id: "+id);
       System.out.println("Name :"+name);
   }
}
