package samsung.one;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        sc.nextLine();

        for(int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(sc.nextLine());

            List<Integer> numList = Arrays.stream(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            int[] temp = new int[numList.size()];
            int maxPrice = 0;
            double result = 0;

            for (int i = n - 1; i >= 0; i--) {
                if (maxPrice < numList.get(i).intValue())
                    maxPrice = numList.get(i).intValue();
                temp[i] = maxPrice - numList.get(i).intValue();
            }
            for (int i = 0; i < temp.length; i++){
                result += temp[i];
            }
            System.out.println("#" + test_case + " " + Math.round(result));
        }
    }
}
