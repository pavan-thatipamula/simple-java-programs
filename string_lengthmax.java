class Check
{
 public static void main(String args[])
 {
	String s="vital   information   rescourses   under sieze";
	String max="";
	int length=0;
	String str[]=s.split(" ");
	for(String t:str)
	{
		if(length<=t.length())
		{
			length=t.length();
			 max=t;
		}
	}
	System.out.println(length+" "+max);
 }
}