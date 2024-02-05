public class Menu{
	public static void main(String[] args)throws java.io.IOException{
		char choice;
		do{
			System.out.println("Help on: ");
			System.out.println("1 if");
			System.out.println("2 if-else");
			System.out.println("3 switch");
			System.out.println("4 while");
			System.out.println("5 for");
			choice=(char)System.in.read();
		}while(choice<'1' || choice>'5');
		switch(choice){
			case '1':
				System.out.println("if case");
				break;
			case '2':
				System.out.println("if-else case");
				break;
			case '3':
				System.out.println("switch case");
				break;
			case '4':
				System.out.println("while case");
				break;
			case '5':
				System.out.println("for case");
				break;
			case '6':
				System.out.println("6 case");
				break;
			default:
			System.out.println("default case");
		}
	}
}