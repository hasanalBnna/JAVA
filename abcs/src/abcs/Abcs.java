/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abcs;


public class Abcs {

        public static void main(String args[])
        {
                
                Scanner s=new Scanner(System.in);
                System.out.println("Enter the password: ");
                String password=s.nextLine();
                
                try
                {
                        if(password.length()<8)
                        {
                                throw new SmallPasswordException();
                        }
                        else
                        {
                                System.out.println("All Okay");
                        }
                }
                catch(Exception e)
                {
                        System.out.println("Too Small");
                        
                }
        }
        
            
            
        
}



