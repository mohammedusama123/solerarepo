package dayFiveAssignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class containsDigitOrNot {
   public static void main(String[] args) {
	String s="heel123lo";
	Pattern pat=Pattern.compile("[a-zA-Z]+");
	Matcher match=pat.matcher(s);
	boolean match1=match.matches();
	System.out.println(match1);
	Pattern pat1=Pattern.compile("[0-9]+");
	Matcher matche=pat1.matcher(s);
	boolean match2=matche.matches();
	System.out.println(match2);
	if(match1==false &&match2==false) {
		System.out.println("it consists of both string and digits");
	}
	else if(match1==false && match2==true){    
		System.out.println("it consists of only digits");
	}
	else if(match1==true && match2==false) {
		System.out.println("it consists of only string");
	}
	System.out.println(Pattern.compile("[A-Z][0-9]+").matcher("A4").matches());	
}
}
