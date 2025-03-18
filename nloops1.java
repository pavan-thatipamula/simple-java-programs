class Check
{
public static void main(String args[])
 {
	int num=134;
	while(num!=0)
	{
		int rem=num%10;
		int count=0;
		for(int x=1;x<=rem;x++)
		{
			if(rem%x==0)
			{
				count++;
			}
			if(count==2)
				{
				System.out.println(rem+" digit is prime");
				}
		}
		num=num/10;
	}
 }
}