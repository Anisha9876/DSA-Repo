package Array.Medium.BrutForce;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        /*
        Given an integer array nums of size n, return the majority element of the array.

       The majority element of an array is an element that appears more than n/2 times in the array.
        The array is guaranteed to have a majority element.
        Input: nums = [7, 0, 0, 1, 7, 7, 2, 7, 7]

        Output: 7

        Explanation:

        The number 7 appears 5 times in the 9 sized array
         */
        int[] nums={7,0,0,1,7,7,2,7,7};
        //using hashmap
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0,val=0;
        for(int i:map.keySet()){
            if(max<map.get(i)){
                max=map.get(i);
                val=i;
            }
        }
        System.out.println(val);
    }
}
