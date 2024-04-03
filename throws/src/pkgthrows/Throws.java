package pkgthrows;

import java.util.*;

public class Throws {
    static double test()throws NegativeRediusException{
       Scanner sc = new Scanner(System.in);
        System.out.print("enter r:");
        int r = sc.nextInt(); 
        double result=Math.PI*r*r;
        return result;
        
    }

    static int func() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a:");
        int a = sc.nextInt();
        System.out.print("enter b:");
        int b = sc.nextInt();
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try{
        int c = func();
        System.out.print(c);
        int d = (int) test();
        System.out.print(d);
        }catch(Exception e){
          System.out.println(e);
        }

    }

    private static class NegativeRediusException extends Exception {

        public NegativeRediusException() {
        }
    }

}
