package airlines;

public class Airlines 
{
    String flightno,destination,passengerid;
    double departuretime,discount;
    
    public Airlines(String theflightno,String thedestination,String thepassengerid,double thedeparturetime,double thediscount)
    {
        flightno=theflightno;
        destination=thedestination;
        passengerid=thepassengerid;
        departuretime=thedeparturetime;
        discount=thediscount;
    }
    public String flightOperator()
    {
        String extract=flightno.substring(0,2);
        if(extract.equalsIgnoreCase("FY"))
        {
            return "firefly airlines";
        }
        else if(extract.equalsIgnoreCase("AK"))
        {
            return "airasia airlines";
        }
        else if(extract.equalsIgnoreCase("GD"))
        {
            return "garuda airlines";
        }
        else if(extract.equalsIgnoreCase("PL"))
        {
            return "pelangi airlines";
        }
        else if(extract.equalsIgnoreCase("MN"))
        {
            return "manila airlines";
        }
        return extract;
    }
    public static void main(String[] args) 
    {
        Airlines a1=new Airlines("FY110","Phuket","WDW12",1425,0.1);
        Airlines a2=new Airlines("AK238","New York","DWD21",2015,0.5);
        
        System.out.println(a1.flightOperator());
        System.out.println(a2.flightOperator());
    }    
}
