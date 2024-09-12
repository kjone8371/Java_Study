package test;


import java.util.Scanner;

class User{
    private String name;
    private int age;
    private String gender;
    private String information;
    private String couple;

    public User(String name, int age, String gender, String information, String couple){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.information = information;
        this.couple = couple;
    }

}

public class test1 {

    private void add(){

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String names = null;
        int ages = 0;
        String genders = null;
        String informations = null;
        String couples = null;

        System.out.println("");


        User user = new User(names, ages,  genders, informations, couples);

    }
}
