import java.util.Scanner;
class Check
{
public static void main(String args[])
 {
	Scanner s=new Scanner(System.in);
	System.out.println("enter a nember :");
	int num=s.nextInt();
	int count=0,temp=num;
	while(num!=0)
	{
	 count++;
	 num=num/10;
	}
		if(count%2==0)
		{
			num=temp;
			while(num!=0)
			{
				int rem=num/100,n1=rem,sum=0;
				while(n1!=0)
				{
					int pro=1;
				 int r=n1%10;
					for(int i=1;i<=n1;i++)
					{
						pro=pro*i;
					}
					sum=sum+pro;
				n1=n1/10;	
				}
			if(sum==rem)
			{
				System.out.println(rem+" is strong number");
			}
				num=num/100;
			}

		}
 }
}