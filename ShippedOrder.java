package order;

public class ShippedOrder extends Order
{
    protected double addshipping=8.5;
    
    public ShippedOrder(String custname,int custno,int quantity,double unitprice)//normal constructor
    {
        super(custname,custno,quantity,unitprice);
    }
    public double computePrice()
    {
        return (super.computePrice()*1.1)+addshipping;
    }
    public String toString()
    {
        return super.toString()+"\nAdditional shipping: RM"+addshipping;
    }
}
