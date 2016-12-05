import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class metalstick10799{

	static char brc[][] = new char[1][1];
	static int rs, temp, ans;

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		brc[0] = sc.next().toCharArray();

		rs = 0;
		temp = 0;
		ans = 0;
        
		Stack<Integer> st = new Stack();

		for (int i = 0; i < brc[0].length; i++) {

			if (brc[0][i] == '(') {

				st.push(i);//�ݼӰ��� ī��Ʈ

			} else if (i - st.peek() == 1) { //���������� Ȯ�� 
				st.pop();
				temp = temp + st.size(); //�������� �߸��� �ݼ� ���� ����
			} else if (brc[0][i] == ')') {
				st.pop();
				temp = temp + 1; // �ݼ� ���� ���� 
			}
		}

		ans = temp;

		System.out.println(ans);

	}
}
