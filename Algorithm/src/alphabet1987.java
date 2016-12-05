import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;


public class alphabet1987 {

	static int R,C;
	static char[][] al;
	static int ans;
	static int max,count;
	static int[][]visit;
	static char[][] used;
	
	public static void main(String args[]) throws Exception {
		
		Scanner sc = new Scanner(System.in);

			R = sc.nextInt();
			C = sc.nextInt();
			visit = new int[R][C];
			al = new char[R][C];
			used = new char[R][C];
			max=0;
			
			for(int i = 0; i < R; i++) {
					al[i] = sc.next().toCharArray();
			}
			count=1;
			backtracking(0,0);
			ans = max;
			System.out.println(ans);
		
	}

	private static void backtracking(int x, int y) {
	
		visit[x][y]=1;
		used[x][y] = al[x][y];
		
		// (x, y) 점에 대하여 상하좌우의 점들이 이동할 수 있는 점인지 확인 후 백트래킹
		if(isIn(x-1, y)) backtracking(x-1, y);
		if(isIn(x+1, y)) backtracking(x+1, y);
		if(isIn(x, y-1)) backtracking(x, y-1);
		if(isIn(x, y+1)) backtracking(x, y+1);
		
		max = Math.max(max, count);
		visit[x][y]=0;
		used[x][y] = ' ';
		count=count-1;
	}
	
	static boolean isIn(int x, int y) {
		
		
		if(x<0 || y<0 || x>=R|| y>=C) return false;
		
		// 직사각형으로 덮여 있거나 이미 지나온 점인지 확인
		if(visit[x][y] != 0) return false;
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(used[i][j] == al[x][y]) return false;
			}
		}
		
		count=count+1;
		return true;
	}
}
