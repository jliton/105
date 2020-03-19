package interview;

import org.testng.annotations.Test;

public class string {
	public String s;
	public int ss=12345;
@Test
public void stringRe() {
	
	 s="selenium";
	for (int i=s.length()-1; i>=0;i--) {
		String rev="";
				System.out.println(rev=rev+s.charAt(i));
		
		
	}
	StringBuffer st=new StringBuffer(s);
	System.out.println(st.reverse());
	System.out.println(new StringBuffer(String.valueOf(ss)).reverse());
	
	
}
}
