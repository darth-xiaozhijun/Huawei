package com.interview;

import java.util.Scanner;

/**
 * 题目描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
 * 最后一个数后面也要有空格
 * 详细描述：
 * 函数接口说明：
 * public String getResult(long ulDataInput)
 * 输入参数：
 * long ulDataInput：输入的正整数
 * 返回值：
 * String
 * 输入描述:
 * 输入一个long型整数
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * 示例1
 * 输入
 * 180
 * 输出
 * 2 2 3 3 5
 * @author Administrator
 *
 */
public class Question06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long aLong = scanner.nextLong();
        
        int a = (int) Math.sqrt(aLong) + 1;
        int i = 2;
        while (aLong != 1 && i <= a) {
            if (aLong % i == 0) {
                aLong /= i;
                System.out.print(i + " ");
                i = 2;
            } else {// 单纯暴力,可以优化为i只包含 '奇数(不含1)' 和'2',我懒
                i++;
            }
        }
        if (i > a) {// 在2-->sqrt(n)中,无因数,输出自身
            System.out.print(aLong + " ");
        }
        scanner.close();
    }
}