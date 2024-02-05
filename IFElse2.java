public class IFElse2{
	public static void main(String[] ars){
		int month=4;
		if(month==12 || month==1 || month==2)
			System.out.println("if condition block");
		else if(month==3 || month==4 || month==5)
			System.out.println("else if condition block");
		else if(month==6 || month==7 || month==8)
			System.out.println("else if condition block");
		else{
			System.out.println("9,10,11");
		}
		switch(month){
			case 12:
			case 1:
			case 2:
				 System.out.println("12,1,2");
				 break;
	}
}