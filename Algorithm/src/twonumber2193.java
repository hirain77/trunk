import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class twonumber2193{

	static int N;
	static long tnum[] = new long[91];

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		
		//점화식 이친수갯수->피보나치 tnum[n] = tnum[n-1]+tnum[n-2]
		tnum[0]=0;
		tnum[1]=1;
		
		for( int i =2; i <=N; i++) {
			 tnum[i] = tnum[i-1]+tnum[i-2];
		}
		//System.out.println(Arrays.toString(tnum));
		
		System.out.println(tnum[N]);

	}
}
