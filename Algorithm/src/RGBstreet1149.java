import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class RGBstreet1149{

	static int N;
	static int cost[][];
	static int ans;
	static int temp[][];

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		cost = new int[3][N];
		
		//점화식 mincost = min( Rmincost, Gmincost, Bmincost) ;  Rmincost[i] = min(G,B)+Rmincost[i-1];
		
		//첫째항
		cost[0][0] = sc.nextInt();
		cost[1][0] = sc.nextInt();
		cost[2][0] = sc.nextInt();
		
		
		for( int i =1; i <N; i++) {
				cost[0][i] = sc.nextInt();
				cost[1][i] = sc.nextInt();
				cost[2][i] = sc.nextInt();
				
				cost[0][i] = cost[0][i] + Math.min(cost[1][i-1],cost[2][i-1]);
				cost[1][i] = cost[1][i] + Math.min(cost[0][i-1],cost[2][i-1]);
				cost[2][i] = cost[2][i] + Math.min(cost[0][i-1],cost[1][i-1]);

		}
		//System.out.println(Arrays.deepToString(cost));
		
		ans = Math.min(cost[0][N-1],Math.min(cost[1][N-1],cost[2][N-1]));

		System.out.println(ans);

	}
}
