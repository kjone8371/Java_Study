package programmers.nunedo1;

public class Solution1 {
    public static void main(String[] args) {
        String msg = "String is beginning";
        int val1 = msg.split(" ").length; // 공백 기준으로 나누어 단어 수를 셈 (3)
        String val2 = String.valueOf(val1); // 정수 3을 문자열 "3"으로 변환

        System.out.println(msg);
        System.out.println(val1 + 10);
        System.out.println(val2 + 10);

    }
}
