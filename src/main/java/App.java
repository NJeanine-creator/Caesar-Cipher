import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the plaintext message : ");
        String text = sc.nextLine();
        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");
        int offset = sc.nextInt();
        System.out.println("Here is the encrypted text : "+Encoding.encrypting( text, offset ));
        System.out.println("Here is the decrypted text : "+Decoding.decrypting(Encoding.encrypting(text,offset)));
    }
}
