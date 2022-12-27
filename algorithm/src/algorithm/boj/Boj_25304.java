package algorithm.boj;
import java.util.*;
// https://www.acmicpc.net/problem/25304

public class Boj_25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int[][] price = new int[N][2];
		int total = 0;
		
		for(int i = 0; i<N; i++) {
			price[i][0] = sc.nextInt();
			price[i][1] = sc.nextInt();
		}
		
		for(int j = 0; j<N; j++) {
			total += price[j][0]*price[j][1];
		}
		
		if (X == total)
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}

// memory : 17852KB, time : 220ms
