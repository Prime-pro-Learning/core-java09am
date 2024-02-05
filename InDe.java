public class InDe{
	public static void main(String[] args){
		int x=42; // x=42
		int y=x++; //y=42 x=42
		int z=++x;//x=43 x=44
		System.out.println("X value: "+x);
		System.out.println("y value: "+y);
		System.out.println("z value: "+z);
		
		double ab=23.0;// ab=ab-1;
		double cd=ab--; // ab=23.0, cd=23.0
		double sa=--cd; // cd= 22 cd=21 sa=21
		System.out.println(sa);//
		
		//y=78;  ++y 79 y++ =79
		int k=96;
		int res=(k<23)?75:64; //96<23
		System.out.println(res);
		
		//(a>b)?exper2:exper3
	}
}