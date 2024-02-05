public class ObjectTest{
	int a,b;
	ObjectTest(int i, int j){
		a=i;
		b=j;
	}
	void equalsTo(Shipment o){
		if(this.a==o.a && this.b==o.b){//return true
			System.out.println("true");
			//return p;
		}
		else
		System.out.println("true");			//return p;
	}
	Person returnValue(){
		//System.out.println("
		return new Person();
	}
	
	public static void main(String[] args){
		ObjectTest ot1=new ObjectTest(12,23);
		Shipment ot2=new Shipment(12,23);
		ot1.equalsTo(ot2);
		System.out.println(ot1.returnValue());
	}
}