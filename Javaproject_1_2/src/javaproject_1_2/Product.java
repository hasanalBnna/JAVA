
package javaproject_1_2;


public class Product {
    
    private int id;
    private String name;
    private float price;
    private String addDate;
    private byte[] picture;
    private final String addData;
    
    public Product(int pid, String pname, float pprice, String pAddData, byte[] pimg )
    {
        this.id=pid;
        this.name = pname;
        this.price = pprice;
        this.addData=pAddData;
        this.picture=pimg;
        
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public float getPrice()
    {
        return price;
    }
    
    public String getAddData()
    {
        return addData;
    }
    
    public byte[] getImage()
    {
        return picture;
    }
    
    
}