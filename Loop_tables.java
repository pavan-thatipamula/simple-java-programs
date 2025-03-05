// print 2 table  like 2 x 1 = 2 up top 10
class Tables
{
public static void main(String args[])
{
	int start=1,end=10,table=676;
	while(start<=end)
	{
		int pro=table*start;
		System.out.println(table+" x "+start+"="+pro);
		start++;
	}
}
}