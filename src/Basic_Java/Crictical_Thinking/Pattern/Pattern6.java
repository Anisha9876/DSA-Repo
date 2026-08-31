package Basic_Java.Crictical_Thinking.Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        /*
        Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:



12345

1234

123

12

1
         */
        int n=5;
        int p;
        for(int i=n;i>0;i--){
            p=1;
            for(int j=0;j<i;j++){
                System.out.print(p);
                p++;
            }

            System.out.println();
        }
    }
}
