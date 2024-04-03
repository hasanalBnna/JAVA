
package thread;


class MyTask implements Runnable  {
    @Override
    public void run()
    {
        for(int doc = 1; doc<10; doc++)
        {
            System.out.println("@@@Printing Document# "+doc + "Printer 2");
        }
    }
}
public class Thread  {
    public static void main(String[] args) // Main Thread -> deafult
    {
//        thread always run instruction sequally
        System.out.println("-----Program Started----");
        Runnable r= new Runnable();
        Thread t = new Thread();
        
        t.start();
//        task.execute();
        for(int doc = 1; doc<10; doc++)
        {
            System.out.println("^^^Printing Document# "+doc + "Printer 1");
        }
        System.out.println("-----Progam Ended-----");
    }
}
