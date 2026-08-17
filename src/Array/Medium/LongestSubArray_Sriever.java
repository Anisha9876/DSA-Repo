package Array.Medium;

public class LongestSubArray_Sriever {
    public static void main(String[] args) {
        int[] arr={3,0,3,8,5,2,9};
        int target=16;
        int sum=0;
        int left=0,right=0;
        int  maxCount =0;

        while (right < arr.length) {
            sum += arr[right];

            while (sum > target) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                maxCount = Math.max(maxCount, right - left + 1);
            }

            right++;
        }
        System.out.println(maxCount);

    }
}
