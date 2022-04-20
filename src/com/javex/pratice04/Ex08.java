package com.javex.pratice04;

public class Ex08 {

	public static void main(String[] args) {
		int[] intArray = new int[6];

		for (int i = 0; i < 6; i++) {
			intArray[i] = (int) (Math.random() * 45) + 1;
			System.out.print(intArray[i] + "\t");

			for (int j = 0; j < i; j++) {
				if (intArray[i] == intArray[j]) {
					i--;
					break;
				}
			}
		}
		
	}

}
