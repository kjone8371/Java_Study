package Study;

import Study.User.User;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        try{

            System.out.println("    연애 질문   ");
            System.out.println("\n");
            System.out.println("당신의 이름 : ");
            String name = scan.nextLine();

            System.out.println("당신의 나이 : ");
            int age = scan.nextInt();
            scan.nextLine();

            System.out.println("당신의 주소 : ");
            String address = scan.nextLine();

            System.out.println("당신이 좋아하는 것 : ");
            String favorite = scan.nextLine();

            System.out.println("당신의 전공 : ");
            String master = scan.nextLine();

            User user = new User(name, age, address, favorite, master);
            System.out.println("");
            user.PrintUserInfo();
            scan.nextLine();
            while(true){

            }
        }catch (Exception e){
            throw new Exception(e);
        }


    }
}
