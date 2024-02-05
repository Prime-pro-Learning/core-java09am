public class TypeConversion{
	public static void main(String[] args){
		byte b=42;
		char c='a';
		short s=1024;
		int i=50000;
		float f=5.64f;
		double d=0.1234;
		double result=(f*b)+(i/c)-(d*s); // f + i-d, f-d
		System.out.println(result);
		int ab=256;
		byte bc=(byte)ab;
		System.out.println(bc);//256
	}
}