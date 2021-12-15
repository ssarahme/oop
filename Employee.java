package employee;
import java.util.*;
import java.text.*;

public class Employee 
{
    String name,empId;
    int hireDate;
    double hour,rate;
    
    public Employee()//default constructor
    {
        name="";
        empId="";
        hireDate=0;
        hour=0.0;
        rate=0.0;
    }
    public Employee(String thename,String theempId,int thehireDate,double thehour,double therate)//normal constructor
    {
        name=thename;
        empId=theempId;
        hireDate=thehireDate;
        hour=thehour;
        rate=therate;
    }
    public Employee(Employee objemployee)//copy constructor
    {
        name=objemployee.name;
        empId=objemployee.empId;
        hireDate=objemployee.hireDate;
        hour=objemployee.hour;
        rate=objemployee.rate;  
    }
    public String getName()//accessor method
    {
        return name;
    }
    public String getEmpId()
    {
        return empId;
    }
    public int getHireDate()
    {
        return hireDate;
    }
    public double getHour()
    {
        return hour;
    }
    public double getRate()
    {
        return rate;
    }
    public void setData(String thename,String theempId,int thehireDate,double thehour,double therate)//mutator method
    {
        name=thename;
        empId=theempId;
        hireDate=thehireDate;
        hour=thehour;
        rate=therate;
    }
    public String toString()//display employee data
    {
        return "\n\tEmployee Details:\nName\t :"+name+"\nEmployee's ID\t :"+empId+"\nHire date :"+hireDate+"\nHour worked\t :"+hour+"\nRate per hour\t :"+rate+"\nSalary\t :RM"+calSalary();
    }
    public double calSalary()//calculate salary where salary=hourxrate //processor method
    {
        return hour*rate;
    }
    public static void main(String[] args) 
    {
        Scanner console=new Scanner(System.in);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        Employee emp1=new Employee();//call default constructor
        
        System.out.print("Name: ");
        String name=console.next();
        System.out.print("Employee's ID: ");
        String empId=console.next();
        System.out.print("Hire date: ");
        int hireDate=console.nextInt();
        System.out.print("Hour: ");
        double hour=console.nextDouble();
        System.out.print("Rate: ");
        double rate=console.nextDouble();
        
        emp1.setData(name,empId,hireDate,hour,rate);
        Employee emp2=new Employee("sara","AR123",2010,9.0,7.0);//call normal constructor
        Employee emp3=new Employee(emp2);
     
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        double[] salary={emp1.calSalary(),emp2.calSalary(),emp3.calSalary()};
        double max=-999;
        for(int i=0;i<3;i++)
        {
            if(salary[i]>max)
            {
                max=salary[i];
            }
        }
        System.out.println("\nHighest salary: RM"+max);
        double min=999;
        for(int i=0;i<3;i++)
        {
            if(salary[i]<min)
            {
                min=salary[i];
            }
        }
        System.out.println("Lowest salary: RM"+min);
        System.out.println("Total salary: RM"+(emp1.calSalary()+emp2.calSalary()+emp3.calSalary()));
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Total salary: RM"+df.format((emp1.calSalary()+emp2.calSalary()+emp3.calSalary())/3));
        
        /*GregorianCalendar gc=new Gregorian Calendar(hireDate);
        Calendar present = new GregorianCalendar();
        if(gc.compareTo(present)>4)
        {
            System.out.println()
        }*/
        
        /*int duration1 = 2021 - emp1.getHireDate();
      int duration2 = 2021 - emp2.getHireDate();
      int duration3 = 2021 - emp3.getHireDate();*/
      
      int year[]={2021-emp1.getHireDate(),2021-emp2.getHireDate(),2021-emp3.getHireDate()};
      String empname[]={emp1.getName(),emp2.getName(),emp3.getName()};
      
      System.out.println("Employees that serve more than 5 years: ");
      for(int i=0;i<year.length;i++)
      {
          if(year[i]>5)
          {
              System.out.println(empname[i]);
          }
      }
    }
}
