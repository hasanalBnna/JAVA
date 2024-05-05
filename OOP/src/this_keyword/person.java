
package this_keyword;

public class person {
    
    String name;
    int age;
    String hairColour;
    
    void massage(){
        System.out.println("this is person info.");
    }
    
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    person(String name, int age, String hairColour){
        this(name, age);
        this.hairColour = hairColour;
    }
    
    void display(){
        massage(); //this.massage();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("hairColour: "+hairColour);
    }
}
