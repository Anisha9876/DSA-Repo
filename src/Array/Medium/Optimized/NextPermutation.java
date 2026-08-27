package Array.Medium.Optimized;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        /*
        A permutation of an array of integers is an arrangement of its members into
        a sequence or linear order.



For example, for arr = [1,2,3], the following are all the permutations of arr:

[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], [3,2,1].



The next permutation of an array of integers is the next
lexicographically greater permutation of its integers.

More formally, if all the permutations of the array are sorted in
 lexicographical order, then the next permutation of that array is the permutation
  that follows it in the sorted order.

If such arrangement is not possible (i.e., the array is the last permutation),
 then rearrange it to the lowest possible order (i.e., sorted in ascending order).

You must rearrange the numbers in-place and use only constant extra memory.


Example 1

Input: nums = [1,2,3]

Output: [1,3,2]

Explanation:

The next permutation of [1,2,3] is [1,3,2].
         */


        int[] nums={2,1,5,4,3,0,0};
//        int nums[]={1,2,3};
        int indx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx=i;
                break;
            }
        }
        if(indx==-1){
            rev(nums);
        }
        int next=Integer.MAX_VALUE;
        int nextIdx=-1;
        for(int i=indx+1;i<nums.length;i++){

            if(nums[i]>nums[indx]){
                if(nums[i]<next){
                    next=nums[i];
                    nextIdx=i;

                }
            }
        }


        int temp2 = nums[nextIdx];
        nums[nextIdx] = nums[indx];
        nums[indx] = temp2;

        for(int i=indx+1;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
    public static void rev(int[] nums){
        int s=0,e=nums.length-1;
        while(e>s){
            int temp=nums[s];
            nums[s]=nums[e];
            nums[e]=temp;
            s++;
            e--;

        }
    }
}
