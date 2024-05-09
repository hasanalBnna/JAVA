
package Inerface_Variables;

interface customerRaj{
    int amnt = 5; //public+static+final
    void purchase();
}

class sellerSanju implements customerRaj{
    @Override
    public void purchase(){
//        amnt =7; //final
        System.out.println("raj needs "+ amnt+" kg rice");
    }
}

public class Main {

    public static void main(String[] args) {
        customerRaj c = new sellerSanju();
        c.purchase();
        System.out.println(customerRaj.amnt);
    }
    
}
