public class
Logical1{
	public void fractionalPart(double value){
		 //double value = 12.56;
		double fractional_part = value % 1;
		double integral_part = value - fractional_part;
		System.out.println("fractional_part " + (float)fractional_part);
		System.out.println("integral_part " + (int)integral_part);
	}
	public static void main(int[] args)throws java.io.IOException{
		//String value1=args[0];
		//System.out.println("args[0]: "+ value1);
		System.out.println("args[1]: "+ args[1]);
		/*Logical1 cal=new Logical1();
		cal.fractionalPart(Double.valueOf(value1));
		cal.fractionalPart(52.12);
		cal.fractionalPart(96.74);*/
	}
}