package Array.Medium.BrutForce;

public class MajorityElement_brut {
    public static void main(String[] args) {
        int[] nums={7,0,0,1,7,7,2,7,7};
        int count;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            count=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if((count+1)>n/2){
                System.out.println(nums[i]);
                return;
            }
        }

    }
}
