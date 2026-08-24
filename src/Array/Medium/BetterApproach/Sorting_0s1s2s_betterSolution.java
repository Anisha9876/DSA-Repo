package Array.Medium.BetterApproach;

public class Sorting_0s1s2s_betterSolution {
    public static void main(String[] args) {
//        Input: nums = [1, 0, 2, 1, 0]
//
//        Output: [0, 0, 1, 1, 2]
//
//        Explanation:
//
//        The nums array in sorted order has 2 zeroes, 2 ones and 1 two


        int[] nums={0,1,2,0,0,1,2,2,0};
        int num0=0,num1=0,num2=0;
        for(int i:nums){
            if(i==0){
                num0++;
            }
            else if(i==1){
                num1++;
            }
            else{
                num2++;
            }
        }
        for(int i=0;i<num0;i++){
            nums[i]=0;
        }
        for(int j=num0;j<num0+num1;j++){
            nums[j]=1;
        }
        for(int j=num0+num1;j<nums.length;j++){
            nums[j]=2;
        }
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
