package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 题目描述
描述：

输入一个整数，将这个整数以字符串的形式逆序输出

程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001


输入描述:
输入一个int整数

输出描述:
将这个整数以字符串的形式逆序输出

示例1
输入
复制
1516000
输出
复制
0006151
 * @author Administrator
 *
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] nums = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i=nums.length-1; i>=0; i--) {
			list.add(nums[i]);
		}
        for (Character character : list) {
			System.out.print(character);
		}
    }
}