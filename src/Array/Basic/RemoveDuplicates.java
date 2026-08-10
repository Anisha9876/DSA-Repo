package Array.Basic;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,4,4,5,8,8};
        int s=0,i=1,c=0;
        while(s<i && i<nums.length){
            if(nums[s] != nums[i]){
                nums[s+1]=nums[i];
                c++;
                s++;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(c+1);
    }
}
