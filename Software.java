package software;
import java.util.*;

public class Software 
{
    String softwareName,softwareType;
    double price;
    
    public Software()//default constructor
    {
        softwareName="";
        softwareType="";
        price=0.0;
    }
    public Software(String thesoftwareName,String thesoftwareType,double theprice)//normal constructor
    {
        softwareName=thesoftwareName;
        softwareType=thesoftwareType;
        price=theprice;
    }
    public Software(Software objsoftware)//copy constructor
    {
        softwareName=objsoftware.softwareName;
        softwareType=objsoftware.softwareType;
        price=objsoftware.price;
    }
    public String getSoftwareName()//accessor method
    {
        return softwareName;
    }
    public String getSoftwareType()
    {
        return softwareType;
    }
    public double getPrice()
    {
        return price;
    }
    public void setData(String thesoftwareName,String thesoftwareType,double theprice)//mutator method
    {
        softwareName=thesoftwareName;
        softwareType=thesoftwareType;
        price=theprice;
    }
    public String toString()//display information
    {
        return "\n\tSoftware name: "+softwareName+"\n\tSoftware type: "+softwareType+"\n\tPrice: RM"+price;
    }
    public static void main(String[] args) 
    {
        Software[] software;//declare array name
        software=new Software[15];//declare no of objects in array
        software[0]=new Software();//create object
        
        Scanner console=new Scanner(System.in);
        
        String softwareName,softwareType;
        double price;
        
        for(int i=0;i<software.length;i++)//user input
        {
            
            System.out.print("\nEnter software name: ");
            softwareName=console.nextLine();
            System.out.print("Enter software type: ");
            softwareType=console.nextLine();           
            System.out.print("Enter price: RM");
            price=console.nextDouble();
            console.nextLine();
            
            software[i]=new Software();
            software[i].setData(softwareName,softwareType,price);
        }
        
        int min=0,max=0;
        
        for(int i=1;i<software.length;i++)//determine highest&lowest price
        {
            if(software[i].getPrice()<software[min].getPrice())
                min=i;
            else if(software[i].getPrice()>software[max].getPrice())
                max=i;         
        }
        System.out.println("\n\tHIGHEST PRICE SOFTWARE"+software[max].toString());
    }    
}
