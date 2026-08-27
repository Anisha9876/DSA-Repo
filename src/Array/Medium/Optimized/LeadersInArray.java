package Array.Medium.Optimized;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -4, -5};
        ArrayList<Integer> list=new ArrayList<>();
        int p=nums.length-1;
        int leaders=Integer.MIN_VALUE;
        while(p>=0){

            if(nums[p]>leaders){

                leaders=nums[p];
                list.add(leaders);

            }

            p--;
        }
        Collections.reverse(list);
        for(int i:list){
            System.out.print(i+" ");
        }

    }
}
