class Check
{
 public static void main(String args[])
 {
   for(int x=1;x<=10;x++)
   {
	int num=x,sum=0,count=0,temp=num;
	while(num!=0)
	{
		count++;
		num=num/10;
	}
	num=temp;
	while(num!=0)
	{
		int rem=num%10;
		sum=sum+(int)Math.pow(rem,count);
		num=num/10;
	}
    
	if(sum==temp)
		System.out.println(temp);
	}
 }
}