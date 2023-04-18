package IncrementAndDecrement;

public class ByteDemo {

	public static void main(String[] args) {

byte a=10;
byte b=20;
//byte c=a+b;Type mismatch: cannot convert from int to byte
//System.out.println(c);
		


     byte c=(byte)(a+b);
     System.out.println(c);
     
     
     byte x=10;
     x++;
     System.out.println(x);

     
     byte y=10;
		/*
		  y=y+1; System.out.println(y);
		*/
	}

}
