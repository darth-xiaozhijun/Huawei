package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * 题目描述
输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。

输入描述:
输入一个int型整数

输出描述:
按照从右向左的阅读顺序，返回一个不含重复数字的新的整数

示例1
输入
复制
9876673
输出
复制
37689
 * @author Administrator
 *
 */
public class Question09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        char[] nums = num.toCharArray();
        List<Character> list = new ArrayList<>();
        for(int i=nums.length-1; i>=0; i--){
        	if (list.contains(nums[i])) {
				continue;
			}
        	list.add(nums[i]);
        }
        for (Character i : list) {
			System.out.print(i);
		}
    }
}