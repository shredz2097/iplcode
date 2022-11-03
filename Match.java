import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int r=0;
		

		System.out.println("Enter the number of consecutive losses you want to find");	

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); /// number of win or loss to find
		List <Result> finalTeam=new ArrayList<>();
		List <Result> team=new ArrayList<>();
		int [] res1= {1,1,0,0,1}; //1 stands for win 0 stands for loss
		int [] res2= {1,0,0,1,1};
		int [] res3= {1,0,1,0,0};
		int [] res4= {1,1,0,1,0};	
		int [] res5= {0,1,1,0,0};
		int [] res6= {0,1,1,0,1};
		int [] res7= {0,1,0,1,0};
		int [] res8= {1,0,0,0,0};
		int [] res9= {0,0,1,0,1};
		int [] res10= {0,1,0,1,1};
		
		
Result r1=new Result(res1,20,"GT");
Result r2=new Result(res2,16,"LSG");
Result r3=new Result(res3,16,"RR");
Result r4=new Result(res4,14,"Dc");
Result r5=new Result(res5,14,"RCB");
Result r6=new Result(res6,12,"KKR");
Result r7=new Result(res7,12,"PBKS");
Result r8=new Result(res8,12,"SRH");
Result r9=new Result(res9,8,"CSK");
Result r10=new Result(res10,8,"MI");


team.add(r1);
team.add(r2);
team.add(r3);
team.add(r4);
team.add(r5);
team.add(r6);
team.add(r7);
team.add(r8);
team.add(r9);
team.add(r10);





for(Result res : team)
{
	count=0;
	int [] arr=res.getResult();
	for(int val:arr)
	{
		if(val==0)
		{
			count++;
		}
		else
		{
			count=0;
		}
		if(count==n)
		{
			finalTeam.add(res);
			
			break;
		}
		
	}
	
}
int totalTeam =0;
float avg=0;



for(Result res :finalTeam)
	{
		totalTeam=totalTeam+1;
		avg=avg+res.getPoints();
		System.out.println(res.getName());	
		
	}
if(totalTeam!=0)
{
	System.out.println("Average is ->"+avg/totalTeam);
}
else 
{
	System.out.println("No Teams with consecutive losses");

}
	}


	
}
class Result{
	
	int result[];
	public Result(int[] result, int points, String name) {
		super();
		this.result = result;
		this.points = points;
		this.name = name;
	}
	int points;
String name;
public int[] getResult() {
	return result;
}
public void setResult(int[] result) {
	this.result = result;
}
public int getPoints() {
	return points;
}
public void setPoints(int points) {
	this.points = points;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}


