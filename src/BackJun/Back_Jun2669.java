package BackJun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Back_Jun2669 {


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[101][101]; // x축 100이상, y축 100이상
        int area = 0; // 총 면적

        for (int l = 0; l < 4; l++) { // 4번 반복
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            for (int i = a+1; i <= c; i++) {
                for (int j = b+1; j <= d; j++) {
                    map[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= 100; i++)
            for (int j = 1; j <= 100; j++) {
                area += map[i][j];
            }
        System.out.println(area);
    }

}



//public class Solution {
//    static int maxIndex = 100;
//    static int[][] arr = new int[maxIndex][maxIndex];
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        // 4번 입력
//        for(int i = 0; i < 4; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            int x1 = Integer.parseInt(st.nextToken());
//            int y1 = Integer.parseInt(st.nextToken());
//            int x2 = Integer.parseInt(st.nextToken());
//            int y2 = Integer.parseInt(st.nextToken());
//
//            Square(x1,y1,x2,y2);
//        }
//
//        System.out.println(sum());
//        br.close();
//    }
//
//    // 좌표값 저장
//    public static void Square(int x1, int y1, int x2, int y2) {
//        for(int i = x1; i < x2; i++) {
//            for(int j = y1; j < y2; j++) {
//                arr[i][j] = 1;
//            }
//        }
//    }
//
//    // 총 넓이 계산
//    public static int sum() {
//        int sum = 0;
//        for(int i = 0; i < maxIndex; i++) {
//            for(int j = 0; j < maxIndex; j++) {
//                sum += arr[i][j];
//            }
//        }
//        return sum;
//    }
//}
