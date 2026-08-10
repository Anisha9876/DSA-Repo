package Array;

public class MoveZeroToTheEnd {
    public static void main(String[] args) {
        /*
        Input: nums = [0, 1, 4, 0, 5, 2]

        Output: [1, 4, 5, 2, 0, 0]
        Given an integer array nums, move all the 0's to the end of the array.
        The relative order of the other elements must remain the same.
        This must be done in place, without making a copy of the array.
         */
        int[] nums={0,1,2,0,0,3,0,4};
        int left=0,right=0,temp;
        while(right<nums.length){
            if(nums[right] !=0)
            {
                temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
            }
            else{
                right++;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
}
