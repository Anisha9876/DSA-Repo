package Array.Medium.BrutForce;

import java.util.ArrayList;

public class LongestConsecutiveElements {
    public static void main(String[] args) {
        /*
        Given an array nums of n integers.

        Return the length of the longest sequence of consecutive integers.
        The integers in this sequence can appear in any order.


        Example 1

        Input: nums = [100, 4, 200, 1, 3, 2]

        Output: 4

        Explanation:

        The longest sequence of consecutive elements in the array is [1, 2, 3, 4],
         which has a length of 4. This sequence can be formed regardless of the initial
         order of the elements in the array.
                 */
//        int[] nums={100, 4, 200, 1, 3, 2};
        int[] nums={8, 3, 7, 2, 5, 8, 4, 6, 0, 1};

       int count;
       int maxCount=0;
       int n;

       for(int i=0;i<nums.length;i++){
           n=nums[i];
           count=1;
           for(int j=0;j<nums.length;j++){
               if(nums[j]==(n+1)){
                   count++;
                   n++;
                   j=-1;

               }
           }
           maxCount=Math.max(count,maxCount);
       }
        System.out.println(maxCount);


    }
}
