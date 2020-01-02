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
实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
输入描述:
字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。

输出描述:
删除字符串中出现次数最少的字符后的字符串。

示例1
输入
复制
abcdd
输出
复制
dd
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