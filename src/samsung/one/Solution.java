package samsung.one;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for(int i = 1; i <= T; i++) {
            int sum=0;
            for(int j = 0; j<10; j++){
                int data = sc.nextInt();
                if(data%2==1){
                    sum+=data;
                }
            }
            System.out.println("#"+i+" "+sum);
        }
        sc.close();
    }
}
