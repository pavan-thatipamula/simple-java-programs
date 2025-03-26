class Array
{
 public static void main(String args[])
 {
	double a[]={10,20,30,40,50};
	double sum=0;
	for(int x=0;x<=a.length-1;x++)
	{
		sum=a[x]+sum;
	}
	double avg=sum/a.length;
	System.out.println(avg);
 }
}