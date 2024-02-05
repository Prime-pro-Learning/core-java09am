import java.util.Scanner;
public class ScannerDemo{
	double fractional_part;
	double integral_part;
	public void process(double value){
		 fractional_part = value % 1;
		 integral_part = value - fractional_part;
		System.out.println("fractional_part " + (float)fractional_part);
		System.out.println("integral_part " + (int)integral_part);
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input value: ");
		double input1=sc.nextDouble();
		//System.out.println(input1);
		ScannerDemo demo=new ScannerDemo();
		demo.process(input1);
	}
}