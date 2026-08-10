package Array;

import java.util.ArrayList;

public class RotateBy_K_Time {
    public static void main(String[] args) {
       /* Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.


        Example 1

        Input: nums = [1, 2, 3, 4, 5, 6], k = 2

        Output: nums = [3, 4, 5, 6, 1, 2]

        Explanation:

        rotate 1 step to the left: [2, 3, 4, 5, 6, 1]

        rotate 2 steps to the left: [3, 4, 5, 6, 1, 2]

        */

        int nums[]={1,2,3,4,5,6};
        int k=7;
        k=k%nums.length;
        int temp=0,temp1=0,temp3;
        for(int i=0;i<k/2;i++){
            temp1=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp1;
        }
        int left = k;
        int right = nums.length - 1;
        while(left < right) {
            temp3=nums[left];
            nums[left]=nums[right];
            nums[right]=temp3;
            left++;
            right--;
        }
        for(int i=0;i<nums.length/2 ;i++){
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
        }

        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
