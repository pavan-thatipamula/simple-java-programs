class Main
{
 public static void main(String args[])
 {
	Main m=new Main();
	int res=m.count(6);
	
	System.out.println(res==2?"is prime":"not prime");
 }
 int num,count;
 void prime()
	{
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
				count++;
		}
		if(count==2)
			System.out.println("is prime");
	}
	int count(int num)
	{
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
				count++;
		}
		return count;
	}
	void prime(int num)
	{	
		for(int x=1;x<=num;x++)
		{
			if(num%x==0)
				count++;
		}
		if(count==2)
			System.out.println("is prime");
		
	}
}