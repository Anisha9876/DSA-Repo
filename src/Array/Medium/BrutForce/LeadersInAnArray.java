package Array.Medium.BrutForce;

public class LeadersInAnArray {
    public static void main(String[] args) {
        /*
        Given an integer array nums, return a list of all the leaders in the array.



        A leader in an array is an element whose value is strictly greater
         than all elements to its right in the given array. The rightmost
          element is always a leader. The elements in the leader array must
           appear in the order they appear in the nums array.


        Example 1

        Input: nums = [1, 2, 5, 3, 1, 2]

        Output: [5, 3, 2]

        Explanation:

        2 is the rightmost element, 3 is the largest element in the
        index range [3, 5], 5 is the largest element in the index range [2, 5]
         */

//        int[] nums={1, 2, 5, 3, 1, 2};
        int[] nums={-3, 4, 5, 1, -4, -5};
        int large=Integer.MIN_VALUE,idx=-1;

        for(int i=nums.length-1;i>=0;i--){

            if(nums[i]>large){
                large=nums[i];
                idx=i;
            }
        }
        System.out.println(idx);
        int[] ans=new int[nums.length-idx];
        int right=nums[nums.length-1];
        int n=0;
        for(int i=idx;i<nums.length;i++){
            if(nums[i]<=nums[idx] && nums[i] >= right){
                ans[n]=nums[i];
                n++;
            }
        }
        for(int i:ans){
            System.out.print(i+" ");
        }

    }
}
