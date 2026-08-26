package Array.Medium.BetterApproach;

public class ReArrangeSignAlter {
    public static void main(String[] args) {
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


        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=positive[i];
            nums[2*i+1]=negative[i];
        }
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
}
