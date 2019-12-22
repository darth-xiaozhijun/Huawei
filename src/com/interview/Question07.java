package com.interview;

import java.util.Scanner;

/**
 * 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * 输入描述:
 * 输入一个正浮点数值
 * 输出描述:
 * 输出该数值的近似整数值
 * 示例1
 * 输入
 * 5.5
 * 输出
 * 6
 * @author Administrator
 *
 */
public class Question07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] nums = input.split("\\.");
        if (Integer.valueOf(nums[1]) >= 5) {
			System.out.println(Integer.valueOf(nums[0]) + 1);
		}else {
			System.out.println(Integer.valueOf(nums[0]));
		}
        
        scanner.close();
    }
}