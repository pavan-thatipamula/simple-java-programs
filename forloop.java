class For
{
public static void main(String args[])
{
	int num=647,rem=0,rev=0,max1=0,max2=0;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		if(rem>max1)
			{
				max1=rem;
			}
		num=num/10;	
	}
	System.out.println(max1+" is 1st largest");
	while(rev!=0)
		{
			rem=rev%10;
			if(rem>max2 && rem!=max1)
				{
					max2=rem;
				}
			rev=rev/10;
		}
		System.out.println(max2+" is 2nd largest");
	
}
}

class Forloop
{
public static void main(String args[])
{
	int num=647,rem=0,max1=0,max2=0,temp=num;
	while(num!=0)
	{
		rem=num%10;
		if(rem>max1)
			{
				max1=rem;
			}
		num=num/10;	
	}
	System.out.println(max1+" is 1st largest");
	while(temp!=0)
		{
			rem=temp%10;
			if(rem>max2 && rem!=max1)
				{
					max2=rem;
				}
			temp=temp/10;
		}
		System.out.println(max2+" is 2nd largest");
	
}
}