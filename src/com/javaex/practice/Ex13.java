package com.javaex.practice;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {		
		Scanner sc=new Scanner(System.in);
		double x, result;		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		x=sc.nextInt();
		if (x<=0) {
			result=x*-(9*x)+2;
		}
		else(x>=0){		
		
		System.out.print("계산결과는 " +result+"입니다");
			    sc.close();
	}
}
