// from a range id num is even add them if odd do the product
class Even
{
public static void main(String args[])
{
	int start=1,end=10,sum=0,pro=1;
	while(start<=end)
		{
			int num=start;
			if(num%2==0)
				 sum=sum+num;
			else
				pro=pro*num;
		start++;
		}
	System.out.println(sum+" is sum of even");
	System.out.println(pro+" is pro of odd");
		
}
}