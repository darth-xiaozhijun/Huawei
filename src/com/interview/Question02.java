package com.interview;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 输入描述:
 * 第一行输入一个有字母和数字以及空格组成的字符串，第二行输入一个字符。
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 * 示例1
 * 输入
 * ABCDEF
 * A
 * 输出
 * 1
 * @author Administrator
 *
 */
public class Question02 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String input2 = scanner.nextLine();
		char[] charArray = input.toCharArray();
		char[] charArray2 = input2.toCharArray();
		char key = charArray2[0];
		int count = 0;
		for (char c : charArray) {
			if (key == c || key == c-32 || key == c+32) {
				count++;
			}
		}
		System.out.println(count);
	}

}
