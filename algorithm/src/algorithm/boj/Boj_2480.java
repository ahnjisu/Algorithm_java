package algorithm.boj;
import java.util.*;

// https://www.acmicpc.net/problem/2480
public class Boj_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;
		int reward = 0;
		
		if (a == b && b == c) 
			reward = 10000+a*1000;
		else if (a==b && b !=c)
			reward = 1000+a*100;
		else if (b==c && a!=c)
			reward = 1000+b*100;
		else if (a==c && a!=b)
			reward = 1000+c*100;
		else {
			if (b > max)
				max = b;
			if (c > max)
				max = c;
			reward = max*100;
		}
		
		System.out.print(reward);

	}

}
