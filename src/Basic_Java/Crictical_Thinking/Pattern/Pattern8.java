package Basic_Java.Crictical_Thinking.Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        /*
        Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



                *********
                 *******
                  *****
                   ***
                    *
         */
        int n=5;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=2*i+1;k>0;k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
