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

//时间复杂度：O(n)
public class Two_Sum {
	public int[] twoSum(int[] nums, int target) {
		int[] result=new int[2];
		Map<Integer,Integer> numMap=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(numMap.containsKey(target-nums[i])){
				result[1] = i;
				result[0] = numMap.get(target - nums[i]);
				return result;
			}else
				numMap.put(nums[i], i);
		}
		return result;
	}
	public static void main(String[] args){
		int[] nums={2, 7, 11, 15};
		Two_Sum ts=new Two_Sum();		
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("please input a target number:");
			int target=sc.nextInt();
			int[] a=ts.twoSum(nums,target);
			System.out.println(Arrays.toString(a));
		}
	}
}
