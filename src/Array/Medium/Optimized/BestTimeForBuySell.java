package Array.Medium.Optimized;

public class BestTimeForBuySell {
    public static void main(String[] args) {
        int[] nums={5, 4, 3, 2, 1,4,8};
        int minBuy=nums[0];
        int profit=0;
        for(int i=1;i<nums.length;i++){
            int cost=nums[i]-minBuy;
            profit= Math.max(cost,profit);

            minBuy=Math.min(nums[i],minBuy);
        }
        System.out.println(profit);
    }
}
