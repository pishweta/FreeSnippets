
public class PrintArray {

	// write a program to find the numbers from the array who's addition is zero
	
	public static void main(String[] args) {
		int[] N = { -1, 1, 8, 3, -5, 5 };
	
			
		for (int i = 0; i < N.length-1; i++) {
			int sum = (N[i]+N[i+1]);
			if (sum==0) {
				System.out.println(N[i]+" "+N[i+1] + " = " + (N[i]+N[i+1]));
			}
			
		}

	}

}
