package algorithm.boj;

import java.util.*;
// https://www.acmicpc.net/problem/5597

public class Boj_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean stuChk[] = new boolean[31]; // 1~30�� �ʿ�, 31ũ���� �迭�� ����. boolean Ÿ���� �����ϸ鼭 false�� �ʱ�ȭ��.
		
		for(int i = 0;i<28;i++) {
			stuChk[sc.nextInt()] = true; // �� 28���� ��ȣ�� �Է�. 28�� �ݺ��ϸ� �ش� ��ġ�� �迭���� true�� ����.
		}
		
		for(int i =1;i<=30;i++) {
			if(!stuChk[i]) // if(stuChk[i] == false)��� ��
				System.out.println(i); // 1~30���� �迭�� ���� false�� ��츸 ���
		}
		

	}

}
