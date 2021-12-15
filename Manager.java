package person;

public class Manager extends Person
{
    protected String department;
    protected double salesvolume;
    
    public Manager(String name,double salary,String department,double salesvolume)//normal constructor
    {
        super(name,salary);
        this.department=department;
        this.salesvolume=salesvolume;
    }
    public String getDepartment()//accessor method
    {
        return department;
    }
    public double getSalesVolume()
    {
        return salesvolume;
    }
    public double calCommission()
    {
        if(salesvolume>=1.00&&salesvolume<=99.99)
        {
            return 0.05*salesvolume;
        }
        else if(salesvolume>=100.00&&salesvolume<=299.99)
        {
            return 0.1*salesvolume;
        }
        else if(salesvolume>=300.00)
        {
            return 0.15*salesvolume;
        }
        return 0;
    }
    public String toString()//toString method
    {
        return "\n-------MANAGER-------"+super.toString()+"\nDepartment: "+department+"\nSales volume: RM"+salesvolume+"\nCommission: RM"+calCommission();
    }
}
