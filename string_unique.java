class Check
{
 public static void main(String args[])
 {
	String s="a lazy dog",s2="";
	for(int x=0;x<s.length();x++)
	{
		char l=s.charAt(x);
		//System.out.println(l);
		if(s.indexOf(l)==s.lastIndexOf(l))
		{
			if(s2.indexOf(l)==-1)
			{
				s2=s2+l;
			}
		}
	}
	System.out.println(s2);
 }
}