package Array.Medium.BrutForce;

public class BestTimeToBuyOrSell {
    public static void main(String[] args) {
        /*
        Given an array arr of n integers, where arr[i]
        represents price of the stock on the ith day. Determine the maximum
         profit achievable by buying and selling the stock at most once.

The stock should be purchased before selling it, and both actions cannot occur on the same day.


Example 1

Input: arr = [10, 7, 5, 8, 11, 9]

Output: 6

Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.
         */


        int maxSell=Integer.MIN_VALUE;
        int profit=0;

        int[] nums={5, 4, 3, 2, 1};
        int minBuy=nums[0],idx=0;
        for(int i=1;i<nums.length;i++){
            if(minBuy>nums[i]){
                minBuy=nums[i];
                idx=i;
            }
        }
        for(int j=idx;j<nums.length;j++){
            if(maxSell<nums[j]){
                maxSell=nums[j];
            }
        }
        System.out.println("MaxProfit = "+ (maxSell-minBuy));


    }
}
