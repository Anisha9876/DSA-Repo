package Array;

public class Largest_Element {
    public static void main(String[] args) {
        int[] nums={1,-3,9,60,50};
    int lar= nums[0];

    for(int i:nums){
        if(lar<=i){
            lar=i;
        }
    }
        System.out.println(lar);

}
}
