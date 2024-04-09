import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private String favorite;


    //유저 (생성자)
    User(String name, int age, String favorite){
        this.name = name;
        this.age = age;
        this.favorite = favorite;
    }

    //유저 정보 출력 메서드
    public void PrintUserInfo(){


            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
            System.out.println("좋아하는 것 : " + favorite);

            if(favorite == favorite){
                System.out.println("");
                System.out.println("당신은 " +favorite+ "을 좋아하는군요!");
            }else {
                return;

            }

    }




    public static void main(String[] args) {

        //문제1. User에서 이름, 나이, 주소를 입력하여, 입력받은 값을 저장하고 저장한 입력값을 다시 입력하여 돌린다.


        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("User");
            while(true){
                System.out.println("당신의 이름은? : ");
                String name = sc.next();
                System.out.println("\n");
                System.out.println("당신의 나이는? : ");
                int age = sc.nextInt();
                System.out.println("\n");
                sc.nextLine(); // 개행 문자 버리기
                System.out.println("당신이 좋아하는 것은? : " );
                String favorite = sc.nextLine();
                System.out.println("\n");

                User user = new User(name, age, favorite);

                System.out.println("  정보  "  );
                System.out.println("");
                user.PrintUserInfo();
                System.out.println("");
            }


        }catch (Exception e){
            new Exception(e);
        }



    }
}
