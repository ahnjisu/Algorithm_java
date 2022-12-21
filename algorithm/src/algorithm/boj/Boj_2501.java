package algorithm.boj;
import java.util.*;
// https://www.acmicpc.net/problem/2501
	
public class Boj_2501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int count = 0; // 몇번째 약수인지 셈
		int result = 0; // K번째 약수를 저장
		
		for (int i = 1; i < N+1; i++) {
			if (N % i == 0)
				count++; // 약수를 하나 셀때마다 count 1씩 증가
			if (count == K) { // K번째 약수를 구했으면 result에 결과값 저장
				result = i; 
				break;
			}
		}
		
		if(count < K) // 만약 약수의 개수가 K보다 작을 경우, 0을 출력
			System.out.print(0);
		else if(count == K)
			System.out.print(result);
	}

// memory : 17724KB, time : 216ms
}
