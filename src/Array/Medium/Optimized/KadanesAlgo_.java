package Array.Medium.Optimized;

public class KadanesAlgo_ {
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int p1=0;
        while(p1<nums.length){
            sum=sum+nums[p1];
            if(max<sum){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
            p1++;
        }
        System.out.println(max);
    }
}
