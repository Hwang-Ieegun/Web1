package com.kr.practice1.func;

import java.util.Scanner;

public class VariablePractice4 {
	public void method() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է��ϼ���(����) : ");
		String str = sc.nextLine();
		
		System.out.println("ù��° ���� : " + str.charAt(0));
		System.out.println("�ι�° ���� : " + str.charAt(1));
		System.out.println("����° ���� : " + str.charAt(2));
		
		
//		for(int i = 0; i < str.length(); i++){
//			System.out.println(i +"��° ���� : " + str.charAt(i));
//		}
		
		sc.close();
	}
}
