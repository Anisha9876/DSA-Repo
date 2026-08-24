package Array.Medium.Optimized;

public class MajorityElementOptimal {
    public static void main(String[] args) {
        //Moore's Voting algorithm
        int[] nums={7,0,0,1,7,7,2,7,7,2,2,2,2,2,2};
        int count=1;
        int ele=nums[0];   //element
        int i=1;
        while(i<nums.length){
            if(count==0){
                ele=nums[i];
                count++;
            }
            if(nums[i]==ele){
                count++;
            }
            else{
                count--;
            }
            i++;
        }
        System.out.println(ele);
    }
}
