package com.javaex.practice;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int h,w;
		float a;
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키:");
		h=sc.nextInt();
		System.out.print("몸무게:");
		w=sc.nextInt();
		a=(h-100)*(float)0.9;
		if (w>a) {
			System.out.println("과체중 입니다.");
		}
		else if(w<a) {
			System.out.println("저체중 입니다.");
		}
		else {
			System.out.println("표준체중 입니다.");
		}
		System.out.println("표준체중:"+a);
		
		sc.close();
	}

}
