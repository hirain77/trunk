import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class Array2test{

	static int test[][] = {{4,3},{2,6},{7,2},{1,4}};
	static int ans;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);


		Arrays.sort(test, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {

					return o1[0] - o2[0];
				
			}
		});

		System.out.println(Arrays.deepToString(test));

	}
}
