public class Command{
	byte value;//declaration //instance variables
	boolean flag;// true, false
	
	public static void main(String[] args){
		Command cm=new Command();
		cm.value=(byte)300;
		//cm.flag=25;
		cm.show();// calling method
	}
	public void show(){ //called
		System.out.println("value: "+value); // method body
		System.out.println("flag: "+flag);
	}
	
	
}