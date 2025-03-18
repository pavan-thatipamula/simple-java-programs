class Check
{
public static void main(String args[])
 {
	int num=145,sum=0,temp=num;
	while(num!=0)
	{
		int rem=num%10;
		int pro=1;
		for(int x=1;x<=rem;x++)
		{
			pro=pro*x;
		}
		if(pro==rem)
			{
			System.out.println(rem+" is strong digit"+" in "+temp);
			}
		sum=sum+pro;
	num=num/10;
	}
	if(sum==temp)
		System.out.println(temp+" is strong num");
	else
		System.out.println(temp+" is not strong num");
 }
}