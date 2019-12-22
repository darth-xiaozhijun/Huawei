package com.interview;

import java.util.Scanner;

/**
 * 题目描述
输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

输入描述:
 输入一个整数（int类型）

输出描述:
 这个数转换成2进制后，输出1的个数

示例1
输入
复制
5
输出
复制
2
 * @author Administrator
 *
 */
public class Question15{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num = scan.nextInt();
        String binaryString = Integer.toBinaryString(num);
        char[] charArray = binaryString.toCharArray();
        int count = 0;
        for (char c : charArray) {
			if (c == '1') {
				count++;
			}
		}
        System.out.println(count);
    }
}