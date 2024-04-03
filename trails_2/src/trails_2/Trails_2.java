
package trails_2;
class student{
    String name;
    int age;
    void funt1(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
    }
    
}
class teacher extends student{
    String qualification;
   void funt2(){
      funt1();
        System.out.println("qualification :"+qualification);
    }
    
        
    
}


public class Trails_2 {


    public static void main(String[] args) {
        teacher t1=new teacher();
        t1.name="banna";
        t1.age=22;
        t1.qualification= "bsc engg";
        t1.funt2();
  
    }
    
}
