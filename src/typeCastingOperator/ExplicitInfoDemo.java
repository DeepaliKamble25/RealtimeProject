package typeCastingOperator;

public class ExplicitInfoDemo {

	public static void main(String[] args) {
		
		
		int x=130;
//		byte b=x;//Type mismatch: cannot convert from int to byte

		
		byte b=(byte) x;//programmer take care of loss of information
		
		/*bigger data type value to smaller data type variable==explicit type casting is required*/
		
		
		System.out.println(b);//output==-126
		
		
		double d=130.456;
		
		int a=(int)d;
		System.out.println(a);//the digit after decimal will lost
		
	}

}
/*Programmer is responsible to to convert data type
 * Explicit Type Casting 
 * Smaller to bigger type casting data type converting
 * Narrowing are down casting
 * LOss of information
 * 
 * 
 * programmer is responsible for explicit type casting
 * when every we are assigning bigger data type value assign to smaller data type variable
 * then explicit type casting is required
 * will be prefrom
 * it is also know as narrowing or down casting
 * their may be chance of loss of information in this type casting
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 