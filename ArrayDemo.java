public class ArrayDemo{
	public static void main(String [] args){
		int arr[]=new int[100];
		arr[0]=40;
		arr[9]=32;
		arr[5]=74;
		arr[6]='A';
		//arr[4]=45.23f;//double or float
		System.out.println(arr[5]);
		System.out.println(arr[1]);
		//char(arr[]) 
		//char arr[]=new char[size];
		//double ad[]=new double[size]; //0.0
		int arr1[]={10,20,30,40,50}; //array initializer 
		System.out.println(arr1[10]);
	}
}