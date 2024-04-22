package BackJun;

import java.util.Scanner;

public class Back_Jun1541 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정함
        String[] subtraction = sc.nextLine().split("-");

        for(int i = 0; i < subtraction.length; i++){
            int temp = 0;

            String[] addition = subtraction[i].split("\\+");

            for(int j = 0; j < addition.length; j++){
                temp += Integer.parseInt(addition[j]);
            }

            if(sum == Integer.MAX_VALUE){
                sum = temp;
            }else {
                sum -= temp;
            }

        }
        System.out.println(sum);
    }
}