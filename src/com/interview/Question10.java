package com.interview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


/**
 * 题目描述
编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。

输入描述:
输入N个字符，字符在ACSII码范围内。

输出描述:
输出范围在(0~127)字符的个数。

示例1
输入
复制
abc
输出
复制
3
 * @author Administrator
 *
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] charArray = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : charArray) {
			set.add(c);
		}
        System.out.println(set.size());
    }
}