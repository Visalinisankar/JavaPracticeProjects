package assistedproject1;

public class TypeCasting {
	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit Type Casting");
		char ch='a';
		System.out.println("Value of ch: "+ch);
		int i=ch;
		System.out.println("Value of i: "+i);
		float f=ch;
		System.out.println("Value of f: "+f);
		long l=ch;
		System.out.println("Value of l: "+l);
		double d=ch;
		System.out.println("Value of d: "+d);		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		float a=45.5f;
		int b=(int)a;
		System.out.println("Before Conversion: Value of a: "+a);
		System.out.println("After Converson: Value of b: "+b);
		int x=17;
		float y=(float)x;
		System.out.println("Before Conversion: Value of x: "+x);
		System.out.println("After Converson: Value of y: "+y);
	}
}
