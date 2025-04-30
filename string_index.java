class Check
{
 public static void main(String args[])
 {
    String s="HELLO ALL";
	String s2="";
	String s3="";
	String s4="";
	for(int x=0;x<s.length();x++)
	{
		char l=s.charAt(x);
		if(x%2==0)
		{
			s2=s2+l;
		}
		else
		{
			s3=s3+l;
		}
	}
	System.out.println(s2);
	System.out.println(s3);
	s2=s2.toLowerCase();
	System.out.println(s2+"lower cases");
	s4=s2+s3;
	System.out.println(s4);
	
 }
}