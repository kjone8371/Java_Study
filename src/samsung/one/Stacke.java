package samsung.one;

import java.util.Scanner;
import java.util.Stack;

public class Stacke {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int T = sc.nextInt();

        Stack<Integer> stackInt = new Stack<>();

        stackInt.push(1);
        stackInt.push(2);
        stackInt.push(3);
        stackInt.push(4);

//        stackInt.pop();
//        stackInt.pop();
//        stackInt.pop();

//        stackInt.push(1);
//        stackInt.push(2);
//        stackInt.push(3);
//        stackInt.push(4);

        System.out.println(stackInt);
    }
}
