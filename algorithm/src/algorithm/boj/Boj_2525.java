package algorithm.boj;

import java.util.*;
// https://www.acmicpc.net/problem/2525

public class Boj_2525 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int minute = sc.nextInt();

		int oven = sc.nextInt();
		int o_minute = minute + oven;

		if (o_minute > 59) {
			hour += o_minute / 60;
			o_minute -= 60 * (o_minute / 60);
		}

		if (hour > 23) 
			hour -= 24;
		System.out.print(hour + " " + o_minute);
	}
}

//Scanner in = new Scanner(System.in);
//
//int A = in.nextInt();
//int B = in.nextInt();
//
//int C = in.nextInt();
//
//int min = 60 * A + B;   // ½Ã -> ºĞ
//min += C;
//
//int hour = (min / 60) % 24;
//int minute = min % 60;
//
//System.out.println(hour + " " + minute);

// memory : 18468KB, time : 228ms