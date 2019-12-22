package com.interview;

import java.util.Scanner;

/**
 * 题目描述
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 * 输出描述:
 * 整数N，最后一个单词的长度。
 * 示例1
 * 输入
 * hello world
 * 输出
 * 5
 * @author Administrator
 *
 */
public class Question01 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] words = input.split(" ");
		System.out.println(words[words.length - 1].length());
	}

}
