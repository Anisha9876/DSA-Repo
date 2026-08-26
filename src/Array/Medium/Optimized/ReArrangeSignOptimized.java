package Array.Medium.Optimized;

public class ReArrangeSignOptimized {
    public static void main(String[] args) {
        int[] nums={1,3,5,-1,-2,-3};
        int[] ans = new int[nums.length];

        int pos=0,neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos=pos+2;
            }
            else{
                ans[neg]=nums[i];
                neg=neg+2;
            }
        }
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
