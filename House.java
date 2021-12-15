package house;
import java.util.Scanner;

public class House 
{
    String location;
    double price;
    String type;
    
    public House()
    {}
    public House(String h_location,double h_price,String h_type)
    {
        location=h_location;
        price=h_price;
        location=h_type;
    }
    public String getLocation()
    {
        return location;
    }
    public double getPrice()
    {
        return price;
    }
    public String getType()
    {
        return type;
    }
    public void setData(String h_location,double h_price,String h_type)
    {
        location=h_location;
        price=h_price;
        type=h_type;
    }
    public String toString()
    {
        return "\nHOUSE INFORMATION\n"+location+"\nRM"+price+"\n"+type;    
    }
    public static void main(String[] args) 
    {
        House ho=new House();
        Scanner console=new Scanner(System.in);
        
        System.out.print("Location: ");
        String location=console.next();
        System.out.print("Price: RM");
        double price=console.nextDouble();
        System.out.print("Type(single-storey/double-storey): ");
        String type=console.next();
        
        ho.setData(location,price,type);
        System.out.println(ho);      
    }   
}