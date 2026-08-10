package Array.Basic;

public class MaxConsecutive {
    public static void main(String[] args) {
        /*
        Given a binary array nums, return the maximum number of consecutive 1s in the array.
        A binary array is an array that contains only 0s and 1s.
        Input: nums = [1, 1, 0, 0, 1, 1, 1, 0]

        Output: 3

        Explanation:

        The maximum consecutive 1s are present from index 4 to index 6, amounting to 3 1s
                 */
        int[] nums={1, 1, 0, 0, 1, 1, 1, 0};
        int c=0,max=0;
        int r=0;
        while(r<nums.length){
            if(nums[r]==1){
                c++;
                r++;
            }
            else if(nums[r]!=1){
                if(max<c){
                    max=c;
                }
                c=0;
                r++;
            }
        }
        System.out.println(max);
    }
}
