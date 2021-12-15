package order;

public class Order 
{
    protected String custname;
    protected int custno,quantity;
    protected double unitprice,totalprice;
    
    public Order(String custname,int custno,int quantity,double unitprice)//normal constructor
    {
        this.custname=custname;
        this.custno=custno;
        this.quantity=quantity;
        this.unitprice=unitprice;
    }
    public String getCustName()//accessor method
    {
        return custname;
    }
    public int getCustNo()
    {
        return custno;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getUnitPrice()
    {
        return unitprice;
    }
    public double computePrice()
    {
        return quantity*unitprice;
    }
    public String toString()
    {
        return "\nCustomer name: "+custname+"\nCustomer number: "+custno+"\nQuantity ordered: "+quantity+"\nUnit price: RM"+unitprice+"\nTotal price: RM"+computePrice();
    }    
}


