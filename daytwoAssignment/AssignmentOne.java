package daytwoAssignment;

public class AssignmentOne {
	

	public void X()

	{ System.out.println("I am in SuperStudy.X()"); }

	public static void main(String[] args)

	{

	SuperStudyChild ssc = new SuperStudyChild();

	ssc.X();

	}

	}

	class SuperStudyChild extends AssignmentOne

	{

	public void X()

	{

	//X();

	System.out.println("I am in SuperStudyChild.X()");

	}

	}

