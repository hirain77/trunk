import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DNA1969 {

	static int N, M;
	static char[][] I;
	static int ans;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		I = new char[N][M];
		for (int i = 0; i < N; i++) {
			I[i] = sc.next().toCharArray();
		}
		
		ans =0;
		
		System.out.println(Arrays.deepToString(I));


		System.out.println(ans);

	}
}
