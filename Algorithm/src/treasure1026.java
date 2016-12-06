import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class treasure1026 {

	static int N;
	static int[] A;
	static int[] B;
	static int Answer;
	
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
			
			N = sc.nextInt();
			int A[] = new int[N];
			int B[] = new int[N];
			
			for(int i = 0; i < N; i++) {
				A[i] = sc.nextInt();
			}
			
			for(int i = 0; i < N; i++) {
				B[i] = sc.nextInt();
			}
			
			int sum=0;
			int temp;
			Arrays.sort(A);
			
			for(int i=N-1; i>=0; i--) {
				for( int j=i; j>=0; j--){
					if(B[i] > B[j]) {
						temp = B[i];
						B[i] = B[j];
						B[j] = temp;
					}
					
				}
			}

			
			for(int i=0; i <N; i++) {
				
				sum = sum+A[i]*B[i];
				
			}

			Answer = sum;
			
		
			System.out.println(Answer);
		
	}

}
