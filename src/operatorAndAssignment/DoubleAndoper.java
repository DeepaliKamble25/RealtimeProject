package operatorAndAssignment;

public class DoubleAndoper {

	public static void main(String[] args) {
		
		
		int x=10,y=15;
		if(++x<10 && ++y>15) //x ==false it will not go to y for evaluating  
		{
			x++;//
		}else
		{
			y++;//y not  evaluate y=16;
		}
		System.out.println("Single OR OPERATOR");
		System.out.println("x value is:    "+x +"   "+ "y value is :  " +y);
	
	}

}
