class Pavan
{
 	public static void main(String args[])
	{
		Even e1=new Even();
	for(int i =1;i<=100;i++)
	{
		e1.num=i;
		e1.even();
		e1.prime();

	}
}
}

class Even
{
	int num;
	 void even()
	{
		if(num%2==0)
			{
			System.out.println("even "+num);
			}

	}

	void prime()
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
				count++;
		}
		if(count==2)
			System.out.println("prime "+num);
	}
}

