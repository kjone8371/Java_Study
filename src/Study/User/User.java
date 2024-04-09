package Study.User;

public class User {
    private String name;
    private int age;
    private String address;
    private String favorite;
    private String master;

    public User(String name, int age, String address, String favorite, String master){
        this.name = name;
        this.age = age;
        this.address = address;
        this.favorite = favorite;
        this.master = master;
    }

    public void PrintUserInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("좋아하는 것 : " + favorite);
        System.out.println("전공 : " + master);
    }

}
