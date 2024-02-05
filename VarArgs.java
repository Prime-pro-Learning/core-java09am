public class VarArgs{
	static void test(int v){
		System.out.print(v + " "); 
	}
	static void vaTest(int value,int ... v) {
		System.out.print("Number of args: " + v.length + " Contents: "); 
		for(int x : v) 
			System.out.print(x + " "); 
		System.out.println(); 
		} 
		public static void main(String args[]) { 
		// Notice how vaTest() can be called with a 
		// variable number of arguments. 
		vaTest(10); // 1 
		 vaTest(1, 2, 3,4,5,6,7,8,9,10,11); // 3 args 
		vaTest(96); // no args 
		test(45);
	} 
}