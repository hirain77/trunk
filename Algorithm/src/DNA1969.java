import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DNA1969 {

	static int N, M;
	static char[][] I;
	static int [][] cnt;
	static int max, ans;
	static char[] ldna;
	static int[] sol;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		I = new char[N][M];
		cnt = new int[4][M];
		ldna = new char[M];
		sol = new int[M];
		
		for (int i = 0; i < N; i++) {
			I[i] = sc.next().toCharArray();
		}
		
		ans =0;
		max =0;
		
		//System.out.println(Arrays.deepToString(I));
		//System.out.println(Arrays.deepToString(cnt));
		
		for(int i=0; i<M; i++) {
			for(int j=0; j <N; j++) {
				if(I[j][i] == 'A') {
					cnt[0][i] = cnt[0][i]+1;
				} else if(I[j][i] == 'C') {
					cnt[1][i] = cnt[1][i]+1;
				} else if(I[j][i] == 'G') {
					cnt[2][i] = cnt[2][i]+1;
				} else if(I[j][i] == 'T') {
					cnt[3][i] = cnt[3][i]+1;
				}
			}
		}
		
		//System.out.println(Arrays.deepToString(cnt));
		
		for(int i=0; i<M; i++) {
			for(int j=0; j <4; j++) {
				if( max < cnt[j][i]) {
					max =  cnt[j][i];
					if(j ==0) {
						ldna[i] ='A';
					}else if(j ==1) {
						ldna[i] ='C';
					}else if(j ==2) {
						ldna[i] ='G';
					}else if(j ==3) {
						ldna[i] ='T';
					}
				}
			}
			max=0;
		}

		
		//System.out.println(Arrays.toString(ldna));
		
		for(int i=0; i<M; i++) {
			for(int j=0; j <N; j++) {
				if(I[j][i] != ldna[i]) {
					sol[i] = sol[i]+1;
				} 
			}
		}
		//System.out.println(Arrays.toString(sol));
		
		for(int k=0; k <M; k++) {
			ans = ans+sol[k];
		}
		
		System.out.println(ldna);
		System.out.println(ans);

	}
}
