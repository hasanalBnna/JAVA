
package problem_1;

public class Box {
    double height, weidth, depth;
    
    Box(double h, double w, double d){
        height =h;
        weidth=w;
        depth=d;
    }
    
    void disVol(){
        double vol= height*weidth*depth;
        System.out.println("volue is: "+vol);
    }
}

