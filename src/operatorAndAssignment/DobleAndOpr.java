package operatorAndAssignment;

public class DobleAndOpr {

	public static void main(String[] args) {

		
		int x=10,y=15;
		if(++x<10 || ++y>15) //(false or true==true)(true then y will not evaluate)
		{
			x++;//x will evaluate x=11;bcoz if condition is true
		}else
		{
			y++;
		}
		System.out.println("Single OR OPERATOR");
		System.out.println("x value is:    "+x +"   "+ "y value is :  " +y);
	
	}

}
