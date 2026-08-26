package Array.Medium.BrutForce;

public class ReArrangeBySign {
    public static void main(String[] args) {
        /*
        Given an integer array nums of even length consisting of
        an equal number of positive and negative integers.Return the answer array
        in such a way that the given conditions are met:

        Every consecutive pair of integers have opposite signs.


        For all integers with the same sign, the order in which they were present in nums is preserved.


        The rearranged array begins with a positive integer.

        Example 1

        Input : nums = [2, 4, 5, -1, -3, -4]

        Output : [2, -1, 4, -3, 5, -4]

        Explanation:

        The positive number 2, 4, 5 maintain their relative positions and -1, -3, -4 maintain their relative positions
                 */
        int[] nums={2, 4, 5, -1, -3, -4};

        int[] positive=new int[nums.length/2];
        int[] negative=new int[nums.length/2];
        int p=0,n=0;
        for(int i:nums){
            if(i<0){
                negative[n]=i;
                n++;
            }
            else if(i>0){
                positive[p]=i;
                p++;
            }
        }


       for(int i=0;i<nums.length;i++){
         for(int j=2*i;j<nums.length;j++){
            nums[j]=positive[i];
         }
         for(int k=2*i+1;k<nums.length;k++){
             nums[k]=negative[i];
         }
       }
       for(int i:nums){
           System.out.print(i+" ");
       }

    }
}
