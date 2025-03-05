class Loop
{
public static void main(String args [])
{
	int n=5,r=2,pro=1,n_r=n-r,pro1=1;
	while(n>=1)
		{
			pro=pro*n;
			n--;
		}
	while(n_r<=1)
		{
		pro1=pro1*n_r;
		n--;
		}
	System.out.println(n+"p"+r+" factorial is "+(pro/pro1));
}
}