public class OuterClass{
	static int outer_x = 100; 
	void test() { 
		 
	}
	static class NestedClass{
		void display(int value){
			System.out.println("Outer_x value: "+ outer_x);
		}
	}
	public static void main(String[] args){
		//OuterClass oc=new OuterClass();
		NestedClass inner = new OuterClass.NestedClass(); 
		inner.display(45);
		//OuterClass oc=new OuterClass();
		//oc.test();
	}
	
}