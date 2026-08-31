package Basic_Java.Crictical_Thinking.Pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        /*
        Given an integer n. You need to recreate the pattern
         given below for any value of N. Let's say for N = 5,
         the pattern should look like as below:



                        *****

                        *****

                        *****

                        *****

                        *****
         */
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value= ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
