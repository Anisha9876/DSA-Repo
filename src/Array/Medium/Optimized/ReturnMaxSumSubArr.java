package Array.Medium.Optimized;

public class ReturnMaxSumSubArr {
    public static void main(String[] args) {
        int[] nums={-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max=Integer.MIN_VALUE;
        int p1=0,start=-1;
         int ansEnd=-1,ansStart=-1;
        while(p1<nums.length){
            sum=sum+nums[p1];

            if(sum<0){
                sum=0;
            }
            if(sum==0) {
                start=p1;
            }
            if(max<sum){
                max=sum;
                ansStart=start+1;
                ansEnd=p1;
            }
            p1++;
        }

    for(int i=ansStart;i<=ansEnd;i++){
        System.out.print(nums[i]+" ");
    }
    }
}
