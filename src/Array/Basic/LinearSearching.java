package Array.Basic;

public class LinearSearching {
    public static void main(String[] args) {
        /*
        Input: nums = [2, 3, 4, 5, 3], target = 3

        Output: 1

        Explanation:

        The first occurence of 3 in nums is at index 1
         */
        int[] nums={2,3,4,5,3};
        int target=3;
        int s=0;
        while(s<nums.length){
            if(nums[s]==target){
                System.out.println(s);
                return;
            }
            s++;
        }
        System.out.println(-1);
    }
}
