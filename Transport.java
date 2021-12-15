package transport;

public class Transport 
{
    String regno,brand;
    double price;
    
    public Transport(String theregno,String thebrand,double theprice)
    {
        regno=theregno;
        brand=thebrand;
        price=theprice;
    }
    public String transportSelangor()
    {
        String extract=regno.substring(0,1);
        if(extract.equalsIgnoreCase("B"))
        {
            return "registered in selangor";
        }
        else
        {
            return "not registered in selangor";
        }
    }
    public double discountPrice(double discount)
    {
        return price*discount;
    }
    public static void main(String[] args) 
    {
        Transport al=new Transport("CAA123","Toyota",120000);
        Transport a2=new Transport("BBJ383","Honda",250000);
        
        System.out.println(al.transportSelangor());
        System.out.println(a2.transportSelangor());
    }   
}
