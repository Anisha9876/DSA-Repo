package Array.Medium.BrutForce;

public class Sorting_0s1s2s_Brut {
    public static void main(String[] args) {

        int[] nums={0,0,1,2,1,2,0,1,0,0};
        //sorting

//

        for(int i=0;i<nums.length-1;i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }
        }
        for(int i:nums){
            System.out.print(i+" ");
        }

    }
}
