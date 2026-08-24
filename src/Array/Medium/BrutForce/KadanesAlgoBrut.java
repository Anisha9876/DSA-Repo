package Array.Medium.BrutForce;

public class KadanesAlgoBrut {
    public static void main(String[] args) {
        /*
        Given an integer array nums, find the subarray with the largest sum and return the sum of
         the elements present in that subarray.

        A subarray is a contiguous non-empty sequence of elements within an array.


        Example 1

        Input: nums = [2, 3, 5, -2, 7, -4]

        Output: 15

        Explanation:

        The subarray from index 0 to index 4 has the largest sum = 15

         */

        int[] nums={2,3,5,-2,7,-4};
        int sum;
        int maxSum=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(sum>maxSum){
                    maxSum=sum;
                }
            }
        }
        System.out.println(maxSum);
    }
}
