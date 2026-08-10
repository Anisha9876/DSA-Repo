package Array.Basic;

public class Scnd_Largest {
    public static void main(String[] args) {
        int arr[]= {1,6,3,5,3,7,6,7};
//        int arr[]={3,3,3,3};
        int lar=Integer.MIN_VALUE;
        int sLar=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(lar<arr[i]){
                sLar=lar;
                lar=arr[i];
            }
            else if(arr[i]>=sLar && arr[i]<lar){
                sLar=arr[i];
            }

        }
        if(sLar == Integer.MIN_VALUE){
            System.out.println(-1);
            return;
        }
        System.out.println(sLar);
    }
}
