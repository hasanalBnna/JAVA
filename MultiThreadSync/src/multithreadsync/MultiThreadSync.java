

package multithreadsync;

import java.util.logging.Level;
import java.util.logging.Logger;

class Printer{
    synchronized void PrintDocument(int numOfDoc, String nameOfDoc)
            // Sync blocks other thread while working under a thread
    {
        for(int i = 1; i<=numOfDoc; i++)
        {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(">>> Printing Document "+nameOfDoc+"#"+i);
        }
    }
}

class MyThread extends Thread{
    Printer pRef;
    public MyThread(Printer p) {
        pRef = p;
    }
    
    @Override
    public void run() {
        synchronized (pRef) {
             pRef.PrintDocument(10, "MyFile.pdf");
        }
    
    }  
}

class banna extends Thread{
    Printer pRef;
     public banna(Printer p){
         pRef=p;
     }
    @Override
    public void run() {
     pRef.PrintDocument(15, "Kazi Hasan Al Banna");
    } 
}

class YourThread extends Thread{
    Printer pRef;
    public YourThread(Printer p) {
        pRef = p;
    }
    
    @Override
    public void run() {
     pRef.PrintDocument(10, "YourDocument.pdf");
    }  
}

public class MultiThreadSync {

    public static void main(String[] args) {
        
        System.out.println("----Application Started-----");
        
//        int i = 10/0;
        Printer printer = new Printer();
//        Multiple Thread Working on the same Printer object
        MyThread mRef = new MyThread(printer); // MyThread having the Printer ref
        YourThread yRef = new YourThread(printer);// YourThread having the Printer ref
        banna bRef = new banna(printer);
        bRef.start();
        mRef.start();
       try {
           mRef.join(); // synchronization 
        } catch (InterruptedException ex) {
            Logger.getLogger(MultiThreadSync.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        // If we want to utlize the printer we cannot join each and every thread
        // Which thread needs to be synchronized we join() it after start()
        yRef.start();
//        Mixed Up
//        Real Time seceriao:
//        kar ta kokhn print hobe jane na
//        If multiple threads are going to work on same
//          object we must synchronize them:
//            We can Pause the execution of  a thread for while
//           sleep()
        System.out.println("----Application Ended-----");
        
    }
    
}

//Output:

// Some user need syn printing
// Some user do not requre syn printing 


