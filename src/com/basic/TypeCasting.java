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
		 
		 
		
		
	}
}
