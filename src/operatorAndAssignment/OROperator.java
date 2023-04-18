package operatorAndAssignment;

public class OROperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10,y=15;
		if(++x<10 | ++y>15) //(false or true==true)
		{
			x++;//x while evaluate x=12;
		}else
		{
			y++;//y not  evaluate x=12;
		}
		System.out.println("Single OR OPERATOR");
		System.out.println("x value is:    "+x +"   "+ "y value is :  " +y);
	}

}
