package Array.Basic;

public class LeftRotateByOne {
    public static void main(String[] args) {
        /*
        Given an integer array nums, rotate the array to the left by one.
            Note: There is no need to return anything, just modify the given array.

            Example 1

            Input: nums = [1, 2, 3, 4, 5]

            Output: [2, 3, 4, 5, 1]

            Explanation:

            Initially, nums = [1, 2, 3, 4, 5]

            Rotating once to left -> nums = [2, 3, 4, 5, 1]
         */
        int nums[]={1,2,3,4,5};

        int f=nums[0];
        for(int i=0;i<nums.length-1;i++){
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=f;

        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
