package Array.Basic;

public class FindingMissingNum {
    public static void main(String[] args) {
        /*
        Input: nums = [0, 2, 3, 1, 4]

        Output: 5

        Explanation:

        nums contains 0, 1, 2, 3, 4 thus leaving 5 as the only missing number in the range [0, 5]

         */


        int[] nums={0,2,3,1,4};
        int i=4,j=6;
        int realSum= (j*(j+1))/2 - ((i-1)*i)/2 ;
        int sum=0;
        for(int k:nums){
            sum=sum+k;
        }
        System.out.println(realSum-sum);

    }
}
