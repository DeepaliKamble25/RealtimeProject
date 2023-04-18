package assignmentOperator;

public class DEmo {

	public static void main(String[] args) {
		
		byte b=10;
//	    b=b+1;                            //Type mismatch: cannot convert from int to byte
//		max(int,byte,int) normal arithmetic
		
//		Increment operator
		byte b1=12;
		b1++;// in place of increment operator internally it will work
//		=(byte)(b1+1)
		System.out.println(b1);
		
		
         byte b2=13;
         b2+=1;
// 		=(byte)(b1+1)
         System.out.println(b2);
         
	}

}
