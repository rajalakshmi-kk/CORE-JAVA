
public class TwoDArrayMinMax {
		public static void main(String[] args) {
			int[][] arr= {
					{2,5,3,7},
					{3,5,8,2},
					{10,21,16,18}
			};
		
			
			for(int i=0; i<3;i++) {
				
				int max = arr[i][0];
				for(int j=1;j<4;j++)
					max=(arr[i][j]>max) ? arr[i][j] : max;
					System.out.println("Row"+(i + 1)+" : "+max);
				 
			}
			
		
		}

}
