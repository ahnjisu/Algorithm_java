package algorithm.boj;

import java.util.*;
// https://www.acmicpc.net/problem/10807

public class Boj_10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++)
			arr[i] = sc.nextInt();

		int v = sc.nextInt();
		int count = 0;

		for (int j = 0; j < N; j++) {
			if (arr[j] == v)
				count++;
		}
		
		System.out.println(count);

	}

}
