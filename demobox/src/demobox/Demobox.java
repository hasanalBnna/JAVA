package demobox;
import java.util.Scanner;
class Box{
double height,width,depth;
double volume(){
return height*width*depth;
}
}
public class Demobox {
public static void main(String[] args) {
double vol1,vol2;
Box obj1 = new Box();
Box obj2 = new Box();
Scanner myScan = new Scanner(System.in);
System.out.println("1st object : ");
System.out.print("Height : ");
obj1.height = myScan.nextDouble();
System.out.print("Width : ");
obj1.width = myScan.nextDouble();
System.out.print("Depth : ");
obj1.depth = myScan.nextDouble();
/*vol1 = */obj1.volume();
System.out.println("Volume : "+obj1.volume());
System.out.println("2nd object : ");
System.out.print("Height : ");
obj2.height = myScan.nextDouble();
System.out.print("Width : ");
obj2.width = myScan.nextDouble();
System.out.print("Depth : ");
obj2.depth = myScan.nextDouble();
vol2 = obj2.volume();
System.out.println("Volume : "+vol2);
}
}
