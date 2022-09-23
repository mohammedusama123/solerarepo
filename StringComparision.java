package daytwo;

public class StringComparision {
  public static void main(String[] args) {
	StringBuffer sb=new StringBuffer("abc");
	StringBuffer sb1=new StringBuffer("abc");
	System.out.println(sb.equals(sb1));//compares content of the strings
	System.out.println(sb==sb1);//compares reference of the string
}
}
