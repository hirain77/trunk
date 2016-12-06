import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Pluscycle1110 {

	static int N;

	static int Answer;
	
	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
			
			N = sc.nextInt();
			int temp=N;
			int cnt =0;

			do {
				temp =   temp%10*10 +  ((temp/10 + temp%10)%10);
				cnt = cnt+1;				
			}while(temp !=N);

			Answer = cnt;
			
		
			System.out.println(Answer);
		
	}



}
