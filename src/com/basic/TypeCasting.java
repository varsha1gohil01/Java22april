package com.basic;

public class TypeCasting {

	/*type casting/conversion
	 * int
	 *  long
	 *  float
	 *  double
	 *  char 
	 *  boolean
	 *  byte
	 *   
	 *   implicite conversion (automatic)= smaller data type to bigger data type
	 *   explicite conversion = bigger data type to smaller data type
	 *  */
	
	
	public static void main(String[] args) {
		 int i1 = 10; // 4 byte
		 long l1 = i1 ; // 8 byte
		 
		 System.out.println("implicite conversion= "+l1);
		 
		 int i2 = (int)l1;
		 System.out.println("explicite conversion= "+i2);
		 
		 int i3 = 128; // 4 byte
		 byte b1 = (byte)i3; // 1 byte // - 128 -127 - 126 -125 -124 -123 to 127
		 
		 System.out.println("explicite conversion= "+b1);
		 
		 
		 
		char cha = 'a';//2 byte
		int i4 = cha; // 4 byte
		
		// it will print ascii value 
		 System.out.println("implicite conversion= "+i4);
		 
		float f1 = 41.5f;
		int i5 = (int)f1;
		 System.out.println("implicite conversion= "+i5);
		 
	
		
	}
}
