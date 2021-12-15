package plane;
import java.util.*;

public class Plane 
{
    char destcode;
    String destname;
    int classplane,quantity;
    double price,totalprice;
    
    public Plane()//default constructor
    {
        destcode=' ';
        destname="";
        classplane=0;
        quantity=0;
        price=0.0;
        totalprice=0.0;
    }
    public void setData(char thedestcode,int theclassplane,int thequantity)//mutator method
    {
        destcode=thedestcode;
        classplane=theclassplane;
        quantity=thequantity;
    }
    public void menu()//display ticket menu
    {
        System.out.println("\t\t\t Arau Airline System");
        System.out.println("*********************************************************************************");
        System.out.println("DESTINATION\t\t TICKET PRICE (one way)\t\t TICKET PRICE (one way)");
        System.out.println("           \t\t\t Class 1               \t\t Class 2");
        System.out.println("*********************************************************************************");
        System.out.println("(P) enang\t\t\t RM 89.00\t\t\t RM 65.00");
        System.out.println("(K) uala Terengganu\t\t RM 186.00\t\t\t RM 120.00");
        System.out.println("(J) ohor Bharu\t\t\t RM 117.00\t\t\t RM 99.00");
        System.out.println("*********************************************************************************");
    }
    public double calcTotalPrice()//calculate total price ticket
    {
        if(destcode=='P')
        {
            destname="Penang";
            if(classplane==1)
            {
                price=89.00;
                totalprice=89.00*quantity;
            }
            else if(classplane==2)
            {
                price=65.00;
                totalprice=65.00*quantity;
            }
        }
        else if(destcode=='K')
        {
            destname="Kuala Terengganu";
            if(classplane==1)
            {
                price=186.00;
                totalprice=186.00*quantity;
            }
            else if(classplane==2)
            {
                price=120.00;
                totalprice=120.00*quantity;
            }
        }
        else if(destcode=='J')
        {
            destname="Johor Bharu";
            if(classplane==1)
            {
                price=117.00;
                totalprice=117.00*quantity;
            }
            else if(classplane==2)
            {
                price=99.00;
                totalprice=99.00*quantity;
            }
        }
        return totalprice;
    }
    public String toString()//display ticket details
    {
        return "\tPayment Details:\nDestination\t :"+destname+"\nQuantity\t :"+quantity+"\nPrice per ticket :RM"+price+"\nTotal price\t :RM"+totalprice;
    }
    public static void main(String[] args) 
    {
        Plane pln=new Plane();
        Scanner console=new Scanner(System.in);
        
        pln.menu();
        
        System.out.print("Select your destination(P/K/J): ");
        char destcode=console.next().charAt(0);
        System.out.print("Class(1/2): ");
        int classplane=console.nextInt();
        System.out.print("Quantity: ");
        int quantity=console.nextInt();
        
        pln.setData(destcode,classplane,quantity);
        pln.calcTotalPrice();
                
        System.out.println("================================================================");       
        System.out.print(pln.toString());
    }    
}
