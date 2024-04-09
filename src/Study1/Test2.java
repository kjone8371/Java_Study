package Study1;


import java.util.HashMap;
import java.util.Scanner;

class A {
    HashMap<String, String> map = new HashMap<String, String>();
    private String[] name = {"김정원", "김아윤", "김겨울", "김경은", "김상영"};
    private String[] info = {"영리", "큐티, 영리, 섹시, 나의 사랑", "큐티, 멍청", "영리", "잘생김, 멍청"};

    public  A(){
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], info[i]);
        }
    }

    public String getInfo(String name){
        return map.get(name);
    }
}


public class Test2 {
    public static void main(String[] args) {
        A a = new A();

        Scanner sc = new Scanner(System.in);

        System.out.println("원하는 이름을 적으시오. : ");
        String InputName = sc.nextLine();

        String Info = a.getInfo(InputName);

        if(Info != null){
            System.out.println(InputName + ": " + Info);
        }else {
            System.out.println("Is not Name!");
        }



    }
}
