package daytwoAssignment;

import java.util.Scanner;

public class SubString {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String s=sc.next();
	System.out.println("enter the starting index");
	int m=sc.nextInt();
	System.out.println("enter the last index");
	int n=sc.nextInt();
	System.out.println("your substring is :"+s.substring(m, n));
}
}
