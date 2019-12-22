package com.interview;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


/**
 * 题目描述
 * 数据表记录包含表索引和数值（int范围的整数），请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 * 输入描述:
 * 先输入键值对的个数
 * 然后输入成对的index和value值，以空格隔开
 * 输出描述:
 * 输出合并后的键值对（多行）
 * 示例1
 * 输入
 * 4
 * 0 1
 * 0 2
 * 1 2
 * 3 4
 * 输出
 * 0 3
 * 1 2
 * 3 4
 * @author Administrator
 *
 */
public class Question08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < size+1; i++) {
			
        	String str = scanner.nextLine();
        	if (str == null || str.equals("")) {
				continue;
			}
			String[] strings = str.split(" ");
			if (treeMap.containsKey(Integer.valueOf(strings[0]))) {
				treeMap.put(Integer.valueOf(strings[0]), 
						treeMap.get(Integer.valueOf(strings[0])) + Integer.valueOf(strings[1]));
			}else {
				treeMap.put(Integer.valueOf(strings[0]), Integer.valueOf(strings[1]));
			}
		}
        for (Integer key : treeMap.keySet()) {
			System.out.println(key + " " + treeMap.get(key));
		}	
    }
}