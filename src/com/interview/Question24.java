package com.interview;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
public class Question24{
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        String string = scan.nextLine();
        char[] charArray = string.toCharArray();
        Set<Character> sets = new HashSet<>();
        for (char c : charArray) {
			sets.add(c);
		}
        Map<Character, Integer> map = new HashMap<>();
        for (Character character : sets) {
        	int count = 0;
			for (char c : charArray) {
				if (c == character) {
					count++;
				}
			}
			map.put(character, count);
		}
        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2)
            {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });
        
    }
}