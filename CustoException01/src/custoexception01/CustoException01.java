/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package custoexception01;

class myException extends Exception{
    public myException(String message){
        super(message);
    }
}
class str{
    public str(int ln)throws myException{
        if(ln<7){
            throw new myException("Exceptio Too Small");
        }
        else{
            System.out.println("All Okay");
        }
    }
}
public class CustoException01 {

    public static void main(String[] args) throws myException  {
        String st = "Hello";
        int ln= st.length();
        try{
            str obj1 = new str(ln);
        }catch(myException e){
            System.out.println(e.getMessage());
        }       
    }    
}
