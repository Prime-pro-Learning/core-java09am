public class Factorial{
	int fact(int n){
		System.out.println("N value: "+ n);
		int result;
		if(n==1) return 1;
		result=fact(n-1)*n;// n=3, n=2, n=1
		return result;
	}
	public static void main(String[] args){
		Factorial ct=new Factorial();
		//boolean ch=ct.fact(5);
		System.out.println(ct.fact(5));
		UsseStatic.meth(45);
	}
}