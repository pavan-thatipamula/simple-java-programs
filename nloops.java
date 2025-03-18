class Check
{
public static void main(String args[])
 {
	for(int x=1;x<=50;x++)
	{
		int num=x,sum=0,temp=num;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum+" is sum of digits of" + temp);

	}
 }
}