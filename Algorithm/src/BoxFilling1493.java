import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class BoxFilling1493{

	static int l,w,h,N,sum;
	static int[][] cube;
	static int tmp,ans;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		l = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		N = sc.nextInt();
		
		cube = new int[N][2];
		tmp =0;
		ans =0;
		for(int i=0; i<N; i++) {
			tmp = sc.nextInt();
			cube[i][0] = (int) Math.pow(2, tmp);
			cube[i][1] = sc.nextInt();
		}
		
		Arrays.sort(cube,new Comparator<int[]>() {
			public int compare( int[] o1, int[] o2) {
				return o2[0] - o1[0];
			}
		});

		//System.out.println(Arrays.deepToString(cube));
		
		sum = l*w*h;
		int i=0;
		int box=0;
		while(sum > 0) {
			if(sum ==0) {
				break;
			}
			
			box =cube[i][0]*cube[i][0]*cube[i][0];
			if( sum >= box) {
				for(int k=0; k <cube[i][1]; k++) {
					if(sum >0 && sum >= box) {
						sum = sum - box;
						ans= ans+1;					
					} else if (sum ==0) {
						break;
					}
				}
			}

			i = i+1;
			if(i == N && sum !=0) {
				ans =-1;
				break;
			}
		}
		

		System.out.println(ans);

	}
}
