package algorithm.boj;

import java.util.*;
// https://www.acmicpc.net/problem/5597

public class Boj_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean stuChk[] = new boolean[31]; // 1~30이 필요, 31크기의 배열을 선언. boolean 타입은 선언하면서 false로 초기화됨.
		
		for(int i = 0;i<28;i++) {
			stuChk[sc.nextInt()] = true; // 총 28명의 번호를 입력. 28번 반복하며 해당 위치의 배열값은 true로 지정.
		}
		
		for(int i =1;i<=30;i++) {
			if(!stuChk[i]) // if(stuChk[i] == false)라는 뜻
				System.out.println(i); // 1~30번의 배열을 돌며 false인 경우만 출력
		}
		

	}

}
