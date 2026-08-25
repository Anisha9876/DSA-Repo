package Array.Medium.BrutForce;

public class MaxSumSubarr {
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        int max=Integer.MIN_VALUE;
        int sum=0,a=0,b=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum=sum+nums[j];
                if(max<sum){
                    max=sum;
                    a=i;
                    b=j;
                }
            }
        }
        for(int i=a;i<=b;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
