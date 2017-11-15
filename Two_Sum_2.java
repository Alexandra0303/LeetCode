package gaogao.study.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
	Given nums = [2, 7, 11, 15], target = 9,
	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].
 * */
//Time complexity:O(n^2)
public class Two_Sum_2{
	public int[] twoSum(int[] nums, int target) throws IllegalArgumentException{
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(target-nums[i]==nums[j])
					return new int[]{i,j};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args){		
		int[] nums={2, 7, 11, 15};
		Two_Sum_2 ts=new Two_Sum_2();	
		try {				
			Scanner sc=new Scanner(System.in);
			while(true){
				System.out.println("please input a number:");
				int target=sc.nextInt();
				int[] a=ts.twoSum(nums,target);
				System.out.println(Arrays.toString(a));
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
