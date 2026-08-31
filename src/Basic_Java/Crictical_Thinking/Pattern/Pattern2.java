package Basic_Java.Crictical_Thinking.Pattern;

public class Pattern2 {
    public static void main(String[] args) {
        /*
        Given an integer n. You need to
        recreate the pattern given below for any value of N.
        Let's say for N = 5, the pattern should look like as below:



                    *

                    **

                    ***

                    ****

                    *****
         */
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
