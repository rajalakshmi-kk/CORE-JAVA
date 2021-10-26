
public class Ex4Array {

	public static void main(String[] args) {
		int[] arr= {853,398,736,1001,738,2873,992};
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length;i++) {
			max=(arr[i]>max) ? arr[i] : max;
			min=(arr[i]<min) ? arr[i] : min;
		}
		System.out.println(max);
		System.out.println(min);
	}

}
