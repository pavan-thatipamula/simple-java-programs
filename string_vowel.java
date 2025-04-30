class Check
{
 public static void main(String args[])
 {
	String s="hello all good morning";
	int acount=0,ecount=0,icount=0,ocount=0,ucount=0;
	for(int x=0;x<s.length();x++)
	{
		char l=s.charAt(x);
		if(l=='a' || l=='A')
		{
			acount++;
		}
		if(l=='e' || l=='E')
		{
			ecount++;
		}
		if(l=='i' || l=='I')
		{
			icount++;
		}
		if(l=='o' || l=='O')
		{
			acount++;
		}
		if(l=='U' || l=='u')
		{
			acount++;
		}
		
	}
System.out.print(acount+" "+ecount+" "+icount+" "+ocount+" "+ucount);
 }
}