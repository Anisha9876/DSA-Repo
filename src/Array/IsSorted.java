package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class IsSorted {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 4,6, 5, 7, 8, 9));
        for(int i=0;i<nums.size()-1;i++){
            if(nums.get(i+1)< nums.get(i)){
                System.out.println(false);
                return;
            }

        }
        System.out.println(true);
    }
}
