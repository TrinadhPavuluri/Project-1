package oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class dataset
{
    Scanner in =new Scanner(System.in);
    static List<Integer> distance= new ArrayList<>();
    static List<Integer> time= new ArrayList<>();
    static List<Integer> speed= new ArrayList<>();
}
class userinput extends dataset
{
    void getinput()
    {
        System.out.println("Enter distance and time : ");
        for (int i=0;i<10;i++)
        {
            int d=in.nextInt();
            int t=in.nextInt();
            super.distance.add(d);
            super.time.add(t);
        }
        
    }
}
class measure extends dataset
{
    void speedcalculations()
    {
        
        for (int i=0;i<super.distance.size();i++)
        {
            int d1=super.distance.get(i);
            int t1=super.time.get(i);
            int s=(int)d1/t1;
            super.speed.add(s);
        }
        
    }
}
class showresults extends dataset
{
    void results()
    {
        for (int i=0;i<super.speed.size();i++)
        {
            System.out.println("distance="+super.distance.get(i)+" time="+super.time.get(i)+" speed="+super.speed.get(i));        
        }
    }
}
public class sampleprogram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		userinput obj1= new userinput();
		obj1.getinput();
		measure obj2= new measure();
		obj2.speedcalculations();
		showresults obj3= new showresults();
		obj3.results();

	}

}
