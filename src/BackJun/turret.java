package BackJun;

import java.util.Scanner;

public class turret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] results = new int[T];  // 결과를 저장할 배열

        for (int t = 0; t < T; t++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();

            results[t] = getNumberOfIntersections(x1, y1, r1, x2, y2, r2);
        }
        sc.close();

        // 결과를 한 번에 출력
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int getNumberOfIntersections(int x1, int y1, int r1, int x2, int y2, int r2) {
        // 두 중심 사이의 거리 계산
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // 완전히 동일한 원
        if (distance == 0 && r1 == r2) {
            return -1;
        }

        // 내접 혹은 외접
        if (distance == r1 + r2 || Math.abs(r1 - r2) == distance) {
            return 1;
        }

        // 두 원이 서로 떨어져 있거나 한 원이 다른 원 안에 있지만 내접하지 않음
        if (distance > r1 + r2 || distance < Math.abs(r1 - r2)) {
            return 0;
        }

        // 두 원이 두 점에서 교차
        return 2;
    }

}
