package operatorAndAssignment;

public class DEmo4 {

	public static void main(String[] args) {
		int x=10;
		if(++x<10 && x/0>10)// first condition is false it will not evaluate second condition
		{
			System.out.println("hello");
		}else// evaluate this condition
		{
			System.out.println("hi");
		}

	}

}
