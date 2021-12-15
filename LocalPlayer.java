package player;
import java.util.*;
import java.text.*;

public class LocalPlayer extends Player //subclass
{
    protected String state;
    
    public LocalPlayer()//default constructor
    {
        super();
        state="";
    }
    public LocalPlayer(String name,String team,String jerseyNumber,int experience,double basicSalary,String state)//normal constructor
    {
        setLocalPlayer(name,team,jerseyNumber,experience,basicSalary,state);
    }
    public LocalPlayer(LocalPlayer objLocalPlayer)//copy constructor
    {
        state=objLocalPlayer.state;
    }
    public String getState()//accessor method
    {
        return state;
    }
    public void setLocalPlayer(String name,String team,String jerseyNumber,int experience,double basicSalary,String state)//mutator method
    {
        super.setPlayer(name, team, jerseyNumber, experience, basicSalary);
        this.state=state;
    }
    public double calculateSalary()//calculate monthly salary
    {
        if(super.getTeam().equalsIgnoreCase("jdt"))
        {
            if(super.getExperience()<4)
            {
                return (super.getBasicSalary()*1.1)+1000;
            }
            else if(super.getExperience()>3&&super.getExperience()<9)
            {
                return (super.getBasicSalary()*1.15)+1000;
            }
            else if(super.getExperience()>8)
            {
                return (super.getBasicSalary()*1.2)+1000;
            }
        }
        else
        {
            if(super.getExperience()<4)
            {
                return super.getBasicSalary()*1.1;
            }
            else if(super.getExperience()>3&&super.getBasicSalary()<9)
            {
                return super.getBasicSalary()*1.15;
            }
            else if(super.getExperience()>8)
            {
                return super.getBasicSalary()*1.2;
            }
        }       
        return 0;
    }
    public String toString()//toString method
    {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString()+"\nState of origin: "+state+"\nMonthly salary: RM"+df.format(calculateSalary())+"\n";
    }
    public static void main(String[] args) 
    {
        LocalPlayer[] PlayerArray=new LocalPlayer[5];
        PlayerArray[0]=new LocalPlayer("Ali","KL City","7",2,3200.00,"WPKL");
        PlayerArray[1]=new LocalPlayer("Ahmad","JDT","22",4,4000.00,"Johor");
        PlayerArray[2]=new LocalPlayer("Abu","Selangor","9",3,3700.00,"Selangor");
        PlayerArray[3]=new LocalPlayer("Hafiz","Melaka United","7",2,3000.00,"Melaka");
        PlayerArray[4]=new LocalPlayer("Amar","Terengganu","7",3,3500.00,"Terengganu");
        
        for(int i=0;i<PlayerArray.length;i++)//output jdt data only
        {
            if(PlayerArray[i].getTeam().equalsIgnoreCase("jdt"))
            {
                System.out.print(PlayerArray[i].toString());
            }
        }
        //System.out.print(Arrays.toString(PlayerArray));//output all data  
    } 
}
