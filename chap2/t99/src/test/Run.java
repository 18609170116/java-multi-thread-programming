package test;

import printstring.PrintString;

public class Run {

	public static void main(String[] args) {
		PrintString printStringService = new PrintString();
		printStringService.printStringMethod();
		System.out.println("��Ҫֹͣ����stopThread="
				+ Thread.currentThread().getName());
		printStringService.setContinuePrint(false);
	}

}
