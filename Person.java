package person;

public class Person 
{
    protected String name;
    protected double salary;
    
    public Person(String name,double salary)//normal constructor
    {
        this.name=name;
        this.salary=salary;
    }
    public String getName()//accessor method
    {
        return name;
    }
    public double getSalary()
    {
        return salary;
    }
    public String toString()//toString method
    {
        return "\nName: "+name+"\nSalary: RM"+salary;
    }        
}
