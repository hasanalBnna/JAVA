
package static_keyword;

public class Student {
    String name;
    int id;
    static String uniName= "BUBT";
    
    Student(String n,  int i){
        name=n;
        id= i;
    }
    
    void disInfo(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("University name:"+uniName);
        System.out.println("\n");
    }
}
