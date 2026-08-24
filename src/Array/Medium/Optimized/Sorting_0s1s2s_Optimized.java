package Array.Medium.Optimized;

public class Sorting_0s1s2s_Optimized {
    public static void main(String[] args) {
        /*
        Input: nums = [1, 0, 2, 1, 0]

            Output: [0, 0, 1, 1, 2]

            Explanation:

            The nums array in sorted order has 2 zeroes, 2 ones and 1 two
         */

       int[] nums={1,0,2,0,1,2,0,0};
       //Dutch National flag method

        int mid=0,low=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }



    }
    public static void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
