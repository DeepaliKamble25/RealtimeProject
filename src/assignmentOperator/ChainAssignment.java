package assignmentOperator;

public class ChainAssignment {

	public static void main(String[] args) {


		int a,b,c,d;
		
		 a=b=c=d=20;
		 
		 System.out.println(a+""+b+""+c+""+d);

		 
		// int a=b=c=d=40;Output:Duplicate local variable a
	}

}
/*we can't perform chain assignment directly at the time of declaration*/