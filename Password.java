package JavaEasy;

import java.util.Scanner;


class PasswordInvalidException extends Exception
{
    public PasswordInvalidException(String str2) {
	super(str2);
   }
    
}






public class Password {
	public static final int password_length = 16;

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println(
				"1. A password must have at least Sixteen characters.\\n"+
				"2. A password contains at least one special character, one Uppercase letter.\\n");
		String s = scn.nextLine();
		int spchar = 0,upcs = 0,lwcs = 0, num=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='!' || s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='$'|| s.charAt(i)=='%' || s.charAt(i)=='^' || s.charAt(i)=='&' || s.charAt(i)=='*' || s.charAt(i)=='(' || s.charAt(i)==')')
            {
				spchar++;
            }
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
            {
                upcs++;
            }
			if(s.charAt(i)>=97 && s.charAt(i)<=122)
            {
                lwcs++;
            }
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                num++;
            }
		}
		try {
			if(spchar>0 && upcs>0 && lwcs>0 && s.length()>16 && num==0)
            {
             throw new PasswordInvalidException("Password Changed Successfully");
            }
            if(num>0)
            {
             throw new PasswordInvalidException("Password Should not have numerics");
            }
            if(s.length()<16)
            {
             throw new PasswordInvalidException("Password length should be greater than 16");
            }
		}
		 catch(Exception e)
        {
          System.out.println(e.getMessage());
          System.out.println("Validation Done!");   
        }
	}
}
