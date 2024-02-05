public class ForDemo{
	public static void main(String[] args){
		//for(init;cond;ite)
		//int i=0;
		int num;
		num=14;
		boolean isPrime;
		if(num<2) isPrime=false;
		else isPrime=true;
		for(int i=2;i<=num/i;i++){
			System.out.println("i value: "+i);
			if((num%i)==0){
				isPrime=false;
				break;
			}
		}
		if(isPrime) System.out.println("Prime number");
		else System.out.println("Not prime");
		/*for(;i<10;){ //10<=10
			// body of the loop
			System.out.println("i value: "+i);
			i++;
		}*/
		//System.out.println("i value: "+i);
		
		for(int a=1, b=4;a<b;a++){
			System.out.println("a value:" +a);
			System.out.println("b value:" +b);
			b--;
		}//for(type var-name:collection)
			int arr[]={10,20};
		int sum=0;
		for(int it:arr) {
			 //sum=sum+it;
			 sum+=it;
			
		}
		System.out.println(sum);
	}
}