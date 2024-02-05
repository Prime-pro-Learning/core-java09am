public class CallByValue{
	int a,b;
	CallByValue(int a, int b){
		this.a=a;
		this.b=b;
	}
	void meth(CallByValue bv){
		System.out.println("BV reference "+bv);
		bv.a*=2;//a=i*2 45
		bv.b/=2;// j=j/2 78
	}
	public static void main(String[] args){
		CallByValue cv=new CallByValue(45,78);
		CallByValue cv2=new CallByValue(45,78);
		System.out.println("CV reference: "+ cv);
		//int a=45, b=78;
		System.out.println("before calling: "+ cv.a+", "+cv.b); //45,78
		//int i,j;
		cv.meth(cv2);//45,78
		System.out.println("after calling: "+ cv2.a+", "+cv2.b);// 90,36
	}
}