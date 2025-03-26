import java.util.Scanner;
class Check
{
 public static void main(String args[])
 {
	Scanner sc=new Scanner(System.in);
	System.out.println()
	int num=sc.nextInt();
	Check c=new Check();
	int val=c.digits(num,0);
	int res=c.sum(num,val,0);
	System.out.println(num==res?"amstrong":"not amstrong");
	
 }

	int digits(int num,int count)
	{
		while(num!=0)
		{
			count++;
			num=num/10;
		}
		return count;
	}
	int sum(int num,int count,int sum)
	{
		while(num!=0)
		{
			int rem=num%10;
			int pow=(int)Math.pow(rem,count);
			sum=sum+pow;
			num/=10;
		}
		return sum;
	}
}