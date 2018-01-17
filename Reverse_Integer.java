package gaogao.study.leetcode;

import java.util.Scanner;
/*Given a 32-bit signed integer, reverse digits of an integer.
Example 1:Input: 123    Output:  321
Example 2:Input: -123   Output: -321
Example 3:Input: 120    Output: 21 
 **/
public class Reverse_Integer {
	public static int reverse(int x) {
        long result=0;
        while(x!=0){
        	result=result*10+(x%10);
        	x=x/10;
        	if( result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
                return 0;
        }
        return (int) result;
    }
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			int a=sc.nextInt();
			System.out.println(Reverse_Integer.reverse(a));
		}
		
	}
}
