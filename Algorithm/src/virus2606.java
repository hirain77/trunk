import java.io.File;
import java.util.Scanner;

public class virus2606 {

	public static int N = 0;
	public static int T = 0;
	public static int count;
	public static int clubno;
	public static int max;
	public static int community[][];
	public static int visited[];
	public static int couple[][];

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		T = sc.nextInt();

		community = new int[N + 1][N + 1];
		visited = new int[N + 1];
		couple = new int[T][2];
		for (int i = 0; i < T; i++) {
			couple[i][0] = sc.nextInt();
			couple[i][1] = sc.nextInt();

			community[couple[i][0]][couple[i][1]] = 1;
			community[couple[i][1]][couple[i][0]] = 1;
		}

		max = 0;
		clubno = 0;

		count = 0;
		if (visited[1] == 0) {
			dfs(1);
			if (count > 1)
				clubno++;
			max = Math.max(max, count);
		}

		max = max - 1;

		System.out.println(max);

	}

	private static void dfs(int from) {

		for (int i = 1; i <= N; i++) {
			if (visited[i] == 0 && community[from][i] == 1) {
				visited[i] = 1;
				count++;
				dfs(i);
			}
		}

	}

}