import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DNA1969 {

	static int N;
	static int[][] I;
	static int ans;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		int I[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			I[i][0] = sc.nextInt();
			I[i][1] = sc.nextInt();
		}

		Arrays.sort(I, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1])
					return o1[0] - o2[0];
				return o1[1] - o2[1];
			}
		});





		System.out.println(ans);

	}
}
