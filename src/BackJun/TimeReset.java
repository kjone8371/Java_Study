package BackJun;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TimeReset {
    public static int[] reverse(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            reversed[nums.length - i - 1] = nums[i];
        }
        return reversed;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversedNumbers = reverse(numbers);
        System.out.print("Reversed array: ");
        for (int num : reversedNumbers) {
            System.out.print(num + " "); // 역순으로 만든 배열의 요소를 출력
        }
    }
}
