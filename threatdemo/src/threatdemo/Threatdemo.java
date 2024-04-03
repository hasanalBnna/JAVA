
package threatdemo;
class play extends Thread{
    
    public void run(){
         for(int i=0;i<6;i++){
        System.out.println("palying");
        try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
            
        
    }
    }
}
class listen extends Thread{
    public void run(){
        for(int i=0;i<6;i++){
            System.out.println("listennng");
            try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
           
        }
    }
}
class pause extends Thread {
     public void run(){
        for(int i=0;i<6;i++){
           System.out.println("pause");
           try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
            
        } 
     }
}

public class Threatdemo {

   
    public static void main(String[] args) {
    play obj1=new play();
    listen obj2=new listen();
    pause obj3=new pause();
    obj1.start();
    try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
    obj2.start();
    try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
    obj3.start();
    try{
            Thread.sleep(500);
        }
        catch(Exception e){
            
        }
    }
    
}
