package program;

public class Program 
{
    String code,description,faculty,programhead;
    int duration;
    
    public Program(String thecode,String thedescription,int theduration,String thefaculty,String theprogramhead)
    {
        code=thecode;
        description=thedescription;
        duration=theduration;
        faculty=thefaculty;
        programhead=theprogramhead;
    }
    public String progLevel()
    {
        String extract=code.substring(2,3);
        if(extract.equals("0"))
        {
            return "certificate";
        }
        else if(extract.equals("1"))
        {
            return "diploma";
        }
        else if(extract.equals("2"))
        {
            return "degree";
        }
        else if(extract.equals("7"))
        {
            return "master";
        }
        else if(extract.equals("9"))
        {
            return "doctorate";
        }
        return extract;
    }
    public static void main(String[] args) 
    {
        Program p1=new Program("CS110","Diploma in Computer Science",3,"Faculty of Computer & Mathematical Sciences","Sara");
        Program p2=new Program("BA910","Diploma in Business",3,"Faculty of Business Studies","Hafiz");
        
        System.out.println(p1.progLevel());
        System.out.println(p2.progLevel());
    }    
}
