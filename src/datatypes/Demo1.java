package datatypes;

public class Demo1 {
	public static void main(String[] args) {
		
//	    by default it will take int (byte, short)
		
//-----------------------------------------------------------------------------------------------------------------	

//    	byte a = 128; Type mismatch: cannot convert from int to byte
		
		byte a = -128;
//-----------------------------------------------------------------------------------------------------------------	
 
//		short b = 327678; Type mismatch: cannot convert from int to short
		
		short b = 32767;	
//-----------------------------------------------------------------------------------------------------------------	
		
//      int c = 2147483648;  The literal 2147483648 of type int is out of range 
		
		int c = 2147483647;
//-----------------------------------------------------------------------------------------------------------------	
				
//		long d = 2147483648; The literal 2147483648 of type int is out of range 
		
		long d = 2147483648L;
//-----------------------------------------------------------------------------------------------------------------	
		
//		by default it will take double 

//		float e = 3.14;  Type mismatch: cannot convert from double to float and upto 6 to 7 decimals
		
		float e = 3.14f;
//-----------------------------------------------------------------------------------------------------------------	
        
		double f = 3.14676755658558999;          // upto 12 to 13 decimals
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);





	}

}
