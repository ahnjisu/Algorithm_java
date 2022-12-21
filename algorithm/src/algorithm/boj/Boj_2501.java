package algorithm.boj;
import java.util.*;
// https://www.acmicpc.net/problem/2501
	
public class Boj_2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int count = 0; // ���° ������� ��
		int result = 0; // K��° ����� ����
		
		for (int i = 1; i < N+1; i++) {
			if (N % i == 0)
				count++; // ����� �ϳ� �������� count 1�� ����
			if (count == K) { // K��° ����� �������� result�� ����� ����
				result = i; 
				break;
			}
		}
		
		if(count < K) // ���� ����� ������ K���� ���� ���, 0�� ���
			System.out.print(0);
		else if(count == K)
			System.out.print(result);
	}

// memory : 17724KB, time : 216ms
}
