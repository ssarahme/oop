package order;

public class UseOrder 
{
    public static void main(String[] args) 
    {
        Order o=new Order("sara",7,3,7.5);
        ShippedOrder so=new ShippedOrder("jas",13,5,4.2);
        
        System.out.println(o.toString());
        System.out.println(so.toString());
    }
}
