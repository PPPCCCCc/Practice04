package com.javex.pratice04;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[5];
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt();
			sum = sum + nums[i];
		}
		System.out.println("평균 : " + sum / nums.length);

	}

}
