class Loop
{
public static void main(String args[])
{
	System.out.println("prime numbers are");
	for(int x=1;x<=100;x++)
	{
	int num=x,count=0,temp=num;
	
	for(int start=1;start<=num;start++)
	{
		if(num%start==0)
			count++;
		
	}
		if(count==2)
			{
				System.out.println(temp);
			}
	}
}
}