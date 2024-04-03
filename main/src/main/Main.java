
package main;

abstract class Bird{
     abstract void owner();
    
     abstract void  price();
         
        
    
}

class Blackbird extends Bird{
    @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Blackbird\n"+"characteristics: "+"it has wings,can fly."+" it has beak"+", it gives eggs");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"500\n");   
     }
}

class Penguin extends Bird{
   @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Penguin\n"+"characteristics: "+"it has wings,can't fly."+" it has beak"+", it gives eggs");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"1000\n");   
     }

}

class Starling extends Bird{
    @Override
        void owner(){
          
     System.out.println("Bird Name: "+"Starling\n"+"characteristics: "+"it has wings,can fly."+" it has beak"+", it gives eggs");   
     }
    @Override
        void price(){
      System.out.println("Price: "+"1500\n");   
     }

}

public class Main {


    public static void main(String[] args) {
        
        //creating object and impliment by this
        
        Blackbird bd = new Blackbird();
        Penguin  pg=new Penguin();
        Starling st =new Starling();
        bd.owner();
        bd.price();
        
        pg.owner();
         pg.price();
         
        st.owner();
        st.price();
        
    //creating reference and impliment by this     
   /* Bird br;
    br=new Blackbird();
    br.owner();
    br.price();
    
    br=new Penguin();
    br.owner();
    br.price();
    
    br=new Starling();
    br.owner();
    br.price();*/
           
   
    }
    
}
