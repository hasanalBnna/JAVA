/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package threadpriority011;

public class ThreadPriority011 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 1;i<10;i+=2){
                    System.out.println("Odd : "+i);
                }
            }
        });
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run(){
                for(int i = 2;i<10;i+=2){
                    System.out.println("Even : "+i);
                }
            }
        });
        t1.start();
        t2.start();
        t1.setPriority(10);
        t2.setPriority(0);
    }    
}
