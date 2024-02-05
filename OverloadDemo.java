public class OverloadDemo{
	OverloadDemo(){
		System.out.println("default constructor");
	}
	OverloadDemo(int value){
		System.out.println("One parameter int value: "+ value);
	}
	OverloadDemo(int v, double d){
		System.out.println("two parameters v and d values: "+ v+", "+d);
	}
	OverloadDemo(double d, int v){
		System.out.println("two parameters d and v values: "+ d+", "+v);
	}
	OverloadDemo(char ch){
		System.out.println("One parameter char value: "+ ch);
	}
	void test(){
		System.out.println("No parameters");
	}
	
	/*void test(int v){
		System.out.println("One parameter v value: "+ v);
	}*/
	void test(int a, int b){
		System.out.println("two parameters a and b values: "+ a+", "+b);
	}
	double test(double d){
		System.out.println("One parameter d value: "+ d);
		return d*d;
	}
	public static void main(String[] ags){
		OverloadDemo demo=new OverloadDemo(45.63,78);
		demo.test();
		demo.test(78);
		demo.test(65,98);
		demo.test(74.12);
	}
}