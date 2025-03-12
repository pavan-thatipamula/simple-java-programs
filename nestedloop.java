class Loop
{
public static void main(String args[])
{

	for(int x=1;x<=10;x++)
	{
		int num=x,sum=0,pro=1;
		System.out.println("factors of "+num+" are");
	for(int start=1;start<=num;start++)
		{
			if(num%start==0)
			{
				System.out.println(start);
				if(start%2==0)
					{
					sum=sum+start;
					}
				else
					{
						pro=pro*start;
					}
			}

		}
		System.out.println(sum+" is sum");
		System.out.println(pro+" is product");
	}
}
}