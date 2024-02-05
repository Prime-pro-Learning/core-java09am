public class SwitchTest{
	public static void main(String[] ars){
		int month=4;
		char ch='Q';
		switch(ch){ // API Type
			case 'A': // UPDATE
				System.out.println("case A");
				break;
			case 'G': //CREATE 
				System.out.println("case G");
				break;
			case 'Y': //GET
				System.out.println("case Y");
				break;
			case 'Q': // DELETE
				switch(month){
					case 1:
						System.out.println("Nested case 1");
						break;
					case 2:
					System.out.println("Nested case 2");
						break;
					case 3:
					System.out.println("Nested case 3");
						break;
					case 4:
					System.out.println("Nested case 4");
						break;
				}
				System.out.println("case Q");
				break;
			default:
				System.out.println("default case");
		}
	}
}
		