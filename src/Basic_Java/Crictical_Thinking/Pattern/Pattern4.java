package Basic_Java.Crictical_Thinking.Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        /*
        Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



1

22

333

4444

55555
         */
        int n=5;
        int p=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(p);
            }
            p++;
            System.out.println();
        }
    }
}
