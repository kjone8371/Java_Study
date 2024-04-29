//package database_user_service.user;
//
//
//import jdk.jfr.Name;
//
//
//public class User {
//
//
//    private final String id; // 아이디
//    private final String email; // 이메일
//    private final String password; // 비번
//    private final String name; //이름
//    private final String gender; // 성별
//    private final int age; // 나이
//    private final String community; // 내용
//    private final String information; // 정보 (커플? or 솔로?) 또는 좋아하는 것
//
//
//    public User(String id, String email, String password, String name, String gender, int age, String community, String information){
//        this.id = id;
//        this.email = email;
//        this.password = password;
//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.community = community;
//        this.information = information;
//    }
//
//    public User(){
//
//    }
//
//
//    public String getId() {
//        return id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getName() {
//        return name;
//    }
//    public String getGender(){
//        return gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getCommunity() {
//        return community;
//    }
//
//    public String getInformation() {
//        return information;
//    }
//
//    @Override
//    public String toString() {
//
//        String str = String.format("아이디:%s \n이메일:%s \n이름:%s \n성별:%s \n나이:%s \n내용:%s \n정보:%s \n",
//
//                id, email, name, gender, age, community, information);
//        return str;
//
//    }
//
//}
