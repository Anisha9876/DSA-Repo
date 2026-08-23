package Array.Medium.Optimized;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums={1,6,2,3,10};
        int tar=7;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        // [1,2,3,6,10]
        int sum;
        int f=0,e=nums.length-1;
        int i,j;
        while(f<e){
            sum=nums[f]+nums[e];
            if(sum==tar){
                i=map.get(nums[f]);
                j=map.get(nums[e]);
                System.out.println(i+" "+j);
                return;
            }
            else if(sum>tar){
                e--;
            }
            else{
                f++;
            }
        }






    }

}
