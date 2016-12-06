import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;


public class ATM11399 {

	static int N;
	static int[] P;
	static int ans;
	static int[]sol;
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);


		
		int temp=0;
		int sum=0;
		
			N = sc.nextInt();

			int P[] = new int[N];
			for(int i = 0; i < N; i++) {
				P[i] = sc.nextInt();
			}
			

			Arrays.sort(P);;

			for(int i=0; i <N; i++) {
				
				temp = temp+P[i];
				sum = sum+temp;
			}
			
			ans = sum;
		
			System.out.println( ans);
		
	}
}
