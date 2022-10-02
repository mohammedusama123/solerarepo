package AssignmentGenerics;

import java.util.Arrays;

public class SwapThePositions  {
   public static <T>T[] swap(T[]list, int firstPosition, int secondPosition){
	   if(firstPosition>list.length-1 || secondPosition>list.length-1) {
		   throw new ArrayIndexOutOfBoundsException();
	   }
	   T t=list[firstPosition];
	   list[firstPosition]=list[secondPosition];
	   list[secondPosition]=t;
	return list;	      
   }
   public static void main(String[] args) {
	String[]list= {"hello","my","name","is","usama"};
     int firstPosition=2;
     int secondPosition=4;
	String[] newList=swap(list,firstPosition,secondPosition);
	System.out.println(Arrays.toString(newList));
	
}
}
