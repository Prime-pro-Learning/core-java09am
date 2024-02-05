public class TwoDArray{
	public static void main(String[] args){
		//int arr[]=new int[10];
		int twoD[][]=new int[3][4];// TWOD 
		int k=0;
		for(int i=0;i<3;i++){ //3
			for(int j=0;j<4;j++){//j=0 1<4
				twoD[i][j]=k;
				k++;
			}
		}
		//[][]  [][][]
		 for(int it[]:twoD){// row
			for(int x:it){//column
			if(x==5) continue ;
				System.out.print(x+" ");
				
			}
			System.out.println();
		}
		/*for(int i=0;i<3;i++){ //3
			for(int j=0;j<4;j++){//4
				System.out.print(twoD[i][j]+" ");
			}
			System.out.println();
		}*/
		/*twoD[0][0]=25;
		twoD[0][1]=35;
		twoD[0][2]=45;
		twoD[0][3]=55;
		
		twoD[1][0]=25;
		twoD[1][1]=35;
		twoD[1][2]=45;
		twoD[1][3]=55;
		
		twoD[2][0]=25;
		twoD[2][1]=35;
		twoD[2][2]=45;
		twoD[2][3]=55;*/
	}
}