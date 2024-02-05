public class Box{
	double width; // instance variables
	double height;
	double depth;
	int ref;
	Box(){
		System.out.println("default constructor");
		width=12.23;
		height=23.12;
		depth=45.21;
	}
	Box(int width, double height, double depth){
		System.out.println("parameter constructor");
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	
	double volume(){/// called
		System.out.println("volume method is calling");
		double result=width*height*depth; //21
		this.main(); //calling
		return result;
	}
	boolean isValid(){
		return true;
	}
	 void setValues(double param1,double param2, double param3){
		System.out.println("setValues method is calling");
		width=param1;
		height=param2;
		depth=param3;
		System.out.println(volume());
	}
	public  void main(){
		System.out.println("main method is calling");//method body
	}
	public static void main(String[] args){
		Box box=new Box();
		box.setValues(12.23,45.21,78.12);
		//setValues(12.23,45.21,78.12);
	}
}