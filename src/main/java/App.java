import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String plaintext = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int shift = sc.nextInt();
        System.out.println("Here is the encrypted text : "+Encode.encrypting( plaintext, shift ));
        System.out.println("Here is the decrypted text : "+Decode.decrypting( Encode.encrypting(plaintext, shift ), shift ));
    }
}
