package Array.Medium.Optimized;

import java.util.HashSet;

public class LongestConsecutiveElement {
    public static void main(String[] args) {
        int[] nums={100, 4, 200, 1, 3, 2,3,5};
        HashSet<Integer> set=new HashSet<>();
        int count;
        int maxCount=0;
        for(int i:nums){
            set.add(i);
        }
        for(int i=0;i<nums.length;i++){
            count=1;
            if(!set.contains(nums[i]-1)){
                int current=nums[i];
                while(set.contains(current+1)){
                    current++;
                    count++;
                }
            }

            maxCount=Math.max(count,maxCount);

        }
        System.out.println(maxCount);
    }
}
