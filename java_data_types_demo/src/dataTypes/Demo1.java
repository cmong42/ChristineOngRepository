package dataTypes;

public class Demo1 {
	public static void main(String[] args) {
	int x = 1;
	System.out.println("The value of x: "+x);
	float y = 1.234567f; //32 bit-use to conserve memory
	System.out.println("The number "+ y + " is a float.");
	double z = 1.45; //64 bit
	//no need to write 1.45d because by default, all decimal numbers are double in java.
	System.out.println(z);
	String s = "Christine";
	System.out.println(s);
	long l = 1234567890l;
	System.out.println(l);
	
}
}
