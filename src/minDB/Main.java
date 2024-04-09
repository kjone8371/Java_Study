package minDB;

import minDB.Search.NameSearch;
import minDB.User.User;
import minDB.Filter.NameFilter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User userInfo = new User();
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("1. 이름 입력");
            System.out.println("2. 이름 검색");
            System.out.println("3. 전체 검색");
            System.out.println("4. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("이름 입력: ");
                    String name = sc.nextLine();
                    System.out.print("정보 입력: ");
                    String info = sc.nextLine();
                    userInfo.addInfo(name, info);
                    System.out.println("저장되었습니다.");
                    break;
                case 2:
                    System.out.print("검색할 이름 입력: ");
                    String searchName = sc.nextLine();
                    String filteredName = NameFilter.filterName(searchName);
                    NameSearch.searchName(userInfo, filteredName);
                    break;
                case 3:
                    NameSearch.searchAll(userInfo);
                    break;
                case 4:
                    running = false;
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
            }
        }

        sc.close();
    }
}
