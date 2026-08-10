package Array.Basic;

import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        /*Input: nums1 = [1, 2, 3, 4, 5], nums2 = [1, 2, 7]

        Output: [1, 2, 3, 4, 5, 7]

        Explanation:

        The elements 1, 2 are common to both, 3, 4, 5 are from nums1 and 7 is from nums2

         */


        int[] arr1={1,1,3,4,5};
        int[] arr2={2,4,7,8,9,45};

        HashSet<Integer> set=new HashSet<>();

        for(int i:arr1){
                set.add(i);

        }
        for(int i:arr2){

                set.add(i);
        }
        int[] result = new int[set.size()];

        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        for(int k:result){
            System.out.print(k+" ");
        }

    }
}
