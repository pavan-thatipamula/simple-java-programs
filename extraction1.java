class Extaction
{
pubic static void main(String args[])
{
	int num=12345,rem=0,rev=0,temp=num,count=0,r1=0,r2=0,pro=0;
	while(num!=0)
	{
		rem=num%10;
		count++;
		rev=rev*10+rem;
		num=num/10;
	}
	System.out.println(rev +" reverse of a number");
	num=temp;
	while(num!=0)
	{
		r1=num%10;
		r2=rev%10;
		count=count/2+1
		pro=pro+(r1*r2);
		num=num/10;
		rev=rev/10;
	}

}
}