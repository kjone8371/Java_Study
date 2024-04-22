package Password;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Scanner;

public class MyPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 암호를 암호화 하세요:");
        String textToEncrypt = sc.nextLine();

        try {
            // 키 생성
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128, new SecureRandom()); // 128비트 AES 키 생성
            SecretKey secretKey = keyGenerator.generateKey();

            // AES 암호화 객체 생성
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);

            // 입력받은 문자열을 암호화
            byte[] encryptedBytes = cipher.doFinal(textToEncrypt.getBytes());

            // 암호화된 데이터를 Base64로 인코딩하여 가독성 있게 출력
            String encodedString = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted text (Base64): " + encodedString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
