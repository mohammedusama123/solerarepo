package daytwoAssignment;

/**
 * @author CUsama
 *
 */
public class StringBufferExample {
    
    public static void main(String[] args) {
    	StringBuffer sb=new StringBuffer("abc");
    	System.out.println(sb.hashCode());
		System.out.println(sb.capacity());//initial capacity of stringBuffer is 16
		sb.append("defhijk");//19=19*2+2
		System.out.println(sb);//16*2+2 when capacity exceeds
		System.out.println(sb.hashCode());//hash code will be before and after append as it does not create new object like String class
		sb.append("lmnopqrstuvwxz");
	    System.out.println(sb.capacity());	
	    System.out.println(sb);
	    
	   
    }
}
