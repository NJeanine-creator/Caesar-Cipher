import java.util.*;
public class Decode {
    private String ciphertext;
    private int shift;

    public Decode(String ciphertext, int shift) {
        this.ciphertext = ciphertext;
        this.shift = shift;
    }

    public String getCiphertext(){
        return this.ciphertext;
    }

    public int getShift(){
        return this.shift;
    }
    public static String decrypting(String ciphertext , int shift){
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)

        {
            // Shift one character at a time
            char alphabet = ciphertext.charAt(i);
            // if alphabet lies between a and z
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);

                // shift alphabet lesser than 'a'
                if(alphabet < 'a') {
                    //reshift to starting position
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            // if alphabet lies between A and Z
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                // shift alphabet
                alphabet = (char) (alphabet - shift);

                //shift alphabet lesser than 'A'
                if (alphabet < 'A') {
                    // reshift to starting position
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else
            {
                decryptMessage = decryptMessage + alphabet;
            }
        }
        return decryptMessage;
    }
}