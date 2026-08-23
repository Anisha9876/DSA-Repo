package Array.Medium;

public class TwoSum_Brut {
    public static void main(String[] args) {
        int nums[]={1,-3,6,7,3,4};
        int tar=0;
        int f=0,e=nums.length-1;
        int sum=0;

        while(e>=0) {
            f=0;
            while (f < e) {
                sum = nums[f] + nums[e];
                if (sum == tar) {
                    System.out.println(f+","+e);
                    return;
                } else {
                    f++;
                }
            }

            e--;
        }


    }
}
