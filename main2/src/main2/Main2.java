
package main2;
 class test{   
      
    public static void checkEligiblity(double Height,int Age)
{
   if(Height<5.7 && Age<15)
   { 
       throw new ArithmeticException("too much younger");
   }
	 else if(Height<5.7 &&  Age>15) 
	 { 
	     throw new ArithmeticException("too short");
	 }
	
	else if(Height>5.7 && Age>50)
	{
	   throw new ArithmeticException("too older");
	} 
	else 
	{
	  System.out.println("eligible");
	}
}

public class Main2 {


      

    public static void main(String[] args) {
        int ID;
           String Name;
            double Height;
            int Age;
    checkEligiblity(5.8, 22);
   System.out.println("Id:59"+"name:Banna"+"height:5.8"+"age:22");
    }
    
}
 }
