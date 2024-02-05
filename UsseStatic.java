public class UsseStatic{
	static int a = 3; 
	static int b; 
	int c;// non static 
	
	UsseStatic(){
		System.out.println("Default constructor"); 
	}
		
	static int meth(int x) { 
		System.out.println(" static method x = " + x); 
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
		//System.out.println("c = " + c);		
		//nonStatic(25);
		return 96;
		
	}
	static {
		// block
		System.out.println(" static block"); 
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
		//System.out.println("c = " + c);	
	}
	{
		// non static block
		System.out.println("instance block"); 
		System.out.println(" a = " + a); 
		System.out.println("b = " + b);
		System.out.println("c = " + c);	
	}
	void nonStatic(int x){
		System.out.println("non static method x = " + x); 
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
		System.out.println("c = " + c);	
		System.out.println(UsseStatic.meth(45));
	}
	public static void main(String[] args){
		UsseStatic us=new UsseStatic();
		//us.nonStatic(78);
		//System.out.println(UsseStatic.meth(45));
	}
}
		