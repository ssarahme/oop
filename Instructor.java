package person;

public class Instructor extends Person
{
    protected String field;
    protected int expertiselevel;
    
    public Instructor(String name,double salary,String field,int expertiselevel)//normal constructor
    {
        super(name,salary);
        this.field=field;
        this.expertiselevel=expertiselevel;
    }
    public String getField()//accessor method
    {
        return field;
    }
    public int getExpertiseLevel()
    {
        return expertiselevel;
    }
    public char determineCategory()
    {        
        if(field.equalsIgnoreCase("ComputerScience")||field.equalsIgnoreCase("Mathematic")||field.equalsIgnoreCase("Statistic"))
        {
            if(expertiselevel==1||expertiselevel==2||expertiselevel==3)
            {
                return 'B';
            }
            else if(expertiselevel==4||expertiselevel==5)
            {
                return 'A';
            }
        }
        else if(field.equalsIgnoreCase("Business")||field.equalsIgnoreCase("Finance")||field.equalsIgnoreCase("Hotel"))
        {
            if(expertiselevel==1||expertiselevel==2||expertiselevel==3||expertiselevel==4)
            {
                return 'B';
            }
            else if(expertiselevel==5)
            {
                return 'A';
            }
        }
        else if(field.equalsIgnoreCase("Accounting")||field.equalsIgnoreCase("Banking"))
        {
            if(expertiselevel==1||expertiselevel==2)
            {
                return 'B';
            }
            else if(expertiselevel==3||expertiselevel==4||expertiselevel==5)
            {
                return 'A';
            }
        }
        return '0';
    }
    public String toString()//toString method
    {
        return "\n-------INSTRUCTOR-------"+super.toString()+"\nField: "+field+"\nLevel of expertise: "+expertiselevel+"\nCategory: "+determineCategory();
    }
}
