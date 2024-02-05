public class Stack{
	int stck[];//
	int index;
	Stack(){// default constructor
		index=-1;
		 stck=new int[15];
	}
	void push(int item){//
		if(index>=10) System.out.println("Stack is full");
		else stck[++index]=item;
	}
	
	int pop(){
		if(index<0){
			System.out.println("Stack is empty"); //{}
			return 0;
		}else 
			return stck[index--];
	}
	public static void main(String[] args){
		Stack sh=new Stack();/// object
		int k=10;
		for(int i=0;i<10;i++)sh.push(k++); //11,12,13,
		for(int i=0;i<15;i++)System.out.println(sh.pop());
		//
	}
}