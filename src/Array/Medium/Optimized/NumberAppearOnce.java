package Array.Medium.Optimized;

import java.util.HashMap;

public class NumberAppearOnce {
    public static void main(String[] args) {
        /*
        Given an array of nums of n integers. Every integer in the array
         appears twice except one integer. Find the number that appeared once in the array.

                Example 1

        Input : nums = [1, 2, 2, 4, 3, 1, 4]

        Output : 3

        Explanation : The integer 3 has appeared only once.

        Example 2

        Input : nums = [5]

        Output : 5

        Explanation : The integer 5 has appeared only once.

         */


        //a^0=a
        //a^a =0
     // this is the one way
      int[] nums={1,2,3,2,1,4,4};
      int result=0;
      for(int i:nums){
          result=result^i;
      }
        System.out.println(result);

         // By using hashMap

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.get(i)==1){
                System.out.println(i);
            }
        }



    }
}
