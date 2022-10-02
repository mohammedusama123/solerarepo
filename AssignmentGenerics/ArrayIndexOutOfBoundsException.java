package AssignmentGenerics;

public class ArrayIndexOutOfBoundsException extends RuntimeException {
	ArrayIndexOutOfBoundsException(){
		super("ArrayIndexOutOfBoundsException occured");
	}
	ArrayIndexOutOfBoundsException(String message){
		super(message);
	}
}
