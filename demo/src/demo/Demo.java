
package demo;

class boxdim{
    double height,width,depth;
    void setvalue(double h, double w,double d){
       
    }
    double getH(){
        return height;
    }
    double getW(){
        return width;
    }
    double getD(){
        return depth;
    }
    
    
}

public class Demo {

    
    public static void main(String[] args) {
      boxdim obj1= new boxdim();
      double hh=10,ww=11,dd=12;
      obj1.setvalue(hh,ww,dd);
      //obj1.height=hh;
      double anum=obj1.height;
    }
    
}
