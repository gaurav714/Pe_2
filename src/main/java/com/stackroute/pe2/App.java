package com.stackroute.pe2;

/**
 * Hello world!
 *
 */
public class App 
{//questin1
	public boolean palindrome(String str) 
	{
		int len=str.length();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			return true;
		}
		else
			return false;
	}
//question2
	public int powFour(int n) {
		
		
		
		
		return 0;
		}
//question3
	public String classIns() {
		
		return null;
	}
	
}