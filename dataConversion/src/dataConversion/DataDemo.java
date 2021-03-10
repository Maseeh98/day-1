package dataConversion;

public class DataDemo {
	public static void main(String[] args) {
		int a= 200;
		long long1 = a;
		System.out.println(long1);
		byte byte1 = (byte) a; // dangerous to use, values may be out of scope, narrowig. 
		System.out.println(byte1);
		
		double d1= 34.0; 
		//float f1=d1;
		
		
	}

}
