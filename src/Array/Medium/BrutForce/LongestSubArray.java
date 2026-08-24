package Array.Medium.BrutForce;

public class LongestSubArray {
    public static void main(String[] args) {
       /*
        Given an array nums of size n and an integer k, find the length
        of the longest sub-array that sums to k. If no such sub-array exists, return 0.

        Example 1

        Input: nums = [10, 5, 2, 7, 1, 9],  k=15

        Output: 4

        Explanation:

        The longest sub-array with a sum equal to 15 is [5, 2, 7, 1], which has a length of 4.
         This sub-array starts at index 1 and ends at index 4, and the sum of its elements
         (5 + 2 + 7 + 1) equals 15. Therefore, the length of this sub-array is 4.
        */
        int[] arr={3,0,3,8,5,2,9};
        int target=16;
        int sum=arr[0];
        int left=0,right=0;

        while(right<arr.length){
            if(sum==target){
                break;
            }
            else if(sum>target){
                sum=sum-arr[left];
                left++;
            }
            else if(sum<target){
                right++;

                sum = sum + arr[right];

            }
        }
        for(int i=left;i<=right;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
