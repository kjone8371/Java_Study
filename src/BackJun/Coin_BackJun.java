package BackJun;

import java.util.Scanner;

public class Coin_BackJun {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int coins[] = {500, 100, 50, 10};
        int totals = scan.nextInt();
        int min = 0;

        for(int coin : coins){
            min += (totals/coin);
            totals %= coin;
        }
        System.out.println(min);

    }
}