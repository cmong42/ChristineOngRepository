package dataTypes;

public class typeCastingDemo {
	//type casting - the conversion of one data type to another
	
	//1) implicit casting (casting is taken care of by compiler)- when we assign a smaller data type to a larger data type.
	//2) explicit casting (programmer casts two values when converting larger types to smaller data types;
	
	
	
	//All the number types (int, short, long, byte) are considered smaller than float or double.
	int x = 1000; //4bytes
	double d1 = x;
	float d2 = x; // even though float is also 4 bytes, it's considered larger and is therefore implicit casting.
	
	float f = 99.18f;
	int i = (int) f; // truncates float
	//if you convert a char to an integer, it will print out the ASC value.
}
