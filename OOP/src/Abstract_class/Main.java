
package Abstract_class;

abstract class animal {
   
   animal(){
       System.out.println("-----All animal class-----");
   }
    public abstract void sound();
}

class dog extends animal {
    
    dog(){
        super();
    }
    public void sound(){
        System.out.println("Dog is Barking");
    }
}

 class lion extends animal {
     
    lion(){
        super();
    }
    public void sound(){
        
        System.out.println("Lion is Roar");
    }
}

public class Main {

    public static void main(String[] args) {
        
        animal ob1 = new dog();
        ob1.sound();
        
        animal ob2 = new lion();
        ob2.sound();
    }
    
}
