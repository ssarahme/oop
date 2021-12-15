package player;

public class Player //superclass
{
    protected String name,team,jerseyNumber;
    protected int experience;
    protected double basicSalary;
    
    public Player()//default constructor
    {
        name="";
        team="";
        jerseyNumber="";
        experience=0;
        basicSalary=0.0;
    }
    public Player(String name,String team,String jerseyNumber,int experience,double basicSalary)//normal constructor
    {
        setPlayer(name,team,jerseyNumber,experience,basicSalary);
    }
    public Player(Player objPlayer)//copy constructor
    {
        name=objPlayer.name;
        team=objPlayer.team;
        jerseyNumber=objPlayer.jerseyNumber;
        experience=objPlayer.experience;
        basicSalary=objPlayer.basicSalary;
    }
    public String getName()//accessor method
    {
        return name;
    }
    public String getTeam()
    {
        return team;
    }
    public String getJerseyNumber()
    {
        return jerseyNumber;
    }
    public int getExperience()
    {
        return experience;
    }
    public double getBasicSalary()
    {
        return basicSalary;
    }
    public void setPlayer(String name,String team,String jerseyNumber,int experience,double basicSalary)//mutator method
    {
        this.name=name;
        this.team=team;
        this.jerseyNumber=jerseyNumber;
        this.experience=experience;
        this.basicSalary=basicSalary;
    }
    public String toString()//toString method
    {
        return "\nPlayer name: "+name+"\nTeam name: "+team+"\nPlayer jersey number: "+jerseyNumber+"\nYears of experience: "+experience+"\nBasic salary of the employee: RM"+basicSalary;
    }  
}
