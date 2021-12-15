package person;
import java.util.*;

public class PersonApplication 
{
    public static void main(String[] args) 
    {
        
        Scanner console=new Scanner(System.in);
        
        System.out.print("-------INSTRUCTOR-------\n");
        System.out.print("Enter name: ");
        String name=console.next();
        System.out.print("Enter salary: RM");
        double salary=console.nextDouble();
        System.out.print("Enter field: ");
        String field=console.next();
        System.out.print("Enter level of expertise: ");
        int expertiselevel=console.nextInt();
        
        Instructor i=new Instructor(name,salary,field,expertiselevel);
        
        System.out.print("-------MANAGER-------\n");
        System.out.print("Enter name: ");
        name=console.next();
        System.out.print("Enter salary: RM");
        salary=console.nextDouble();
        System.out.print("Enter department: ");
        String department=console.next();
        System.out.print("Enter sales volume: RM");
        double salesvolume=console.nextDouble();
        
        Manager m=new Manager(name,salary,department,salesvolume);
        
        System.out.print(i.toString());
        System.out.print(m.toString());
    }   
}
