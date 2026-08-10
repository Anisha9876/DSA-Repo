package Array;

public class RightRotateBy_K_Time {
    public static void main(String[] args) {
        /*
        Input: nums = [1,2,3,4,5,6,7], k = 3

        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]

         */
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
         k=k % nums.length;
        int temp1,temp2,temp3;
        for(int i=0;i<nums.length/2;i++){
            temp1=nums[i];
            nums[i]=nums[nums.length-i-1];
            nums[nums.length-i-1]=temp1;
        }
        //7,6,5,4,3,2,1

        for(int i=0;i<k/2;i++){
            temp2=nums[i];
            nums[i]=nums[k-i-1];
            nums[k-i-1]=temp2;
        }
        //5,6,7,4,3,2,1

        int left=k,right=nums.length-1;
        while(right>left){
            temp3=nums[left];
            nums[left]=nums[right];
            nums[right]=temp3;
            left++;
            right--;
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
