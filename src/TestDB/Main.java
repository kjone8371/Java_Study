package TestDB;

import java.util.HashMap;
import java.util.Scanner;


class User{
    HashMap<String, String> map = new HashMap<String, String>();

    public void addInfo(String name, String info) {
        map.put(name, info);
    }

    public String getInfo(String name) {
        return map.get(name);
    }

    public void displayAllInfo() {
        System.out.println("전체 정보:");
        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }
    }


}


public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println("1. 이름 입력 : ");
            System.out.println("2. 이름 검색 : ");
            System.out.println("3. 전체 검색 : ");
            System.out.println("4. 종료 ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 :
                    System.out.println("이름 입력 : ");
                    String name = sc.nextLine();
                    System.out.println("정보 입력 : ");
                    String info = sc.nextLine();
                    user.addInfo(name, info);
                    System.out.println("저장되었습니다.");
                    break;
                case 2 :
                    System.out.println("검색 할 이름 : ");
                    String searchName = sc.nextLine();
                    String getName = user.getInfo(searchName);
                    if(getName != null){
                        System.out.println("\n");
                        System.out.println(searchName + ": " + " " + getName);
                        System.out.println("\n");
                    }else {
                        System.out.println("예외 발생!");
                    }
                    break;
                case 3 :
                    System.out.println("\n");
                    user.displayAllInfo();
                    System.out.println("\n");
                    break;
                case 4 :
                    run = false;
                    System.out.println("시스템 종료.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }
        sc.close();
    }
}
