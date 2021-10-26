
public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr= {
				{2,5,3,7},
				{3,5,8,2},
				{10,21,16,18}
		};
		
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=0;
			for(int j=0;j<4;j++)
				sum+=arr[i][j];
			System.out.println("the sum of row "+ (i + 1) +":"+" "+sum);
		}
		
		System.out.println(" ");
		
		int add=0;
		for(int i=0;i<4;i++) {
			add=0;
			for(int j=0;j<3;j++)
				add+=arr[j][i];
			System.out.println("the sum of column "+ (i + 1) +":"+" "+add);
		}
		
		

	}

}
