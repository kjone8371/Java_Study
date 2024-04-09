package Study1;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Integer [][] arr2 = {{1,4,2,6,3},{9,8,0,7,5}};

        Arrays.sort(arr2[0]);
        Arrays.sort(arr2[1]);
        System.out.println(Arrays.deepToString(arr2));
    }
}
