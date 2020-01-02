package com.interview;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace(" ", "");
        char[] charArray = input.toCharArray();
        int h = Integer.valueOf(String.valueOf(charArray[0]));
        int l = Integer.valueOf(String.valueOf(charArray[1]));
        boolean[][] jz = new boolean[h][l];
        for(int i = 0; i < h; i++ ){
        	String x = scanner.nextLine();
        	x = x.replace(" ", "");
        	char[] array = x.toCharArray();
        	for(int j=0; j<l; j++){
        		
        		if("0".equals(String.valueOf(array[j]))){
        			jz[i][j] = false;
        		}else {
        			jz[i][j] = true;
        		}
        	}
        }
        System.out.println(getNum(jz));
	}
	
	public static int getNum(boolean[][] grid){
		int m = grid.length;
		if(m==0){
			return 0;
		}
		int count = 0;
		int n = grid[0].length;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j] == true){
					dfs(grid,i,j);
					count++;
				}
			}
		}
		return count;
	}

	private static void dfs(boolean[][] grid, int i, int j) {

		if(i<0 || j<0 || i>=grid.length || j>=grid[0].length){
			return ;
		}
		if(grid[i][j] == true){
			grid[i][j] = false;
			dfs(grid, i-1, j);
			dfs(grid, i+1, j);
			dfs(grid, i, j-1);
			dfs(grid, i, j+1);
		}
	}
}
