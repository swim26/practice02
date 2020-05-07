package com.javaex.practice;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c,number;
		System.out.println("숫자 3개를 입력해주세요.");
		System.out.print("숫자1: ");
		a=sc.nextInt();
		System.out.print("숫자2: ");
		b=sc.nextInt();
		System.out.print("숫자3: ");
		c=sc.nextInt();
		
		if((a<=b)&(a<=c)){
			number=a;
			System.out.println("가장 작은수는 "+number+" 입니다.");
		}
		else if((b<=a)&(b<=c)) {
			number=b;
			System.out.println("가장 작은수는 "+number+" 입니다.");
		}
		else if((c<=a)&(c<=b)) {
			number=c;
			System.out.println("가장 작은수는 "+number+" 입니다.");
		}
		else {
			number=a;
			System.out.println("가장 작은수는 "+number+" 입니다.");
		}		
	    sc.close();
	}
}
