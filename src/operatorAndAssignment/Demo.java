package operatorAndAssignment;

public class Demo {

	public static void main(String[] args) {
		
		int x=10,y=15;
		if(++x<10 & ++y>15) 
		{
			x++;
		}else
		{
			y++;
		}
		System.out.println("Single AND OPERATOR");
		System.out.println("x value is:    "+x +"   "+ "y value is :  " +y);
		
		
	}

}
