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
对字符串中的所有单词进行倒排。

说明：

1、每个单词是以26个大写或小写英文字母构成；

2、非构成单词的字符均视为单词间隔符；

3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；

4、每个单词最长20个字母；

输入描述:
输入一行以空格来分隔的句子

输出描述:
输出句子的逆序

示例1
输入
复制
I am a student
输出
复制
student a am I
 * @author Administrator
 *
 */
public class Question31{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        for (int i=0; i<charArray.length; i++) {
			if(!((charArray[i] >= 'a' && charArray[i] <= 'z') || (charArray[i] >= 'A' && charArray[i] <= 'Z'))){
				charArray[i] = ' ';
			}
		}
//        System.out.println(String.valueOf(charArray));
        input = String.valueOf(charArray);
        if(input.startsWith(" ")){
        	input = input.substring(1, input.length());
        }
        String[] strs = input.split(" ");
        for(int i = strs.length-1; i>=0; i--){
        	if (i == 0) {
        		if (strs[i].equals("")) {
					
				}else {
					System.out.print(strs[i]);
				}
			}else {
				System.out.print(strs[i] + " ");
			}
        }
    }
}