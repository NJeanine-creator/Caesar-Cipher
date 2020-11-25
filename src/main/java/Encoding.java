import java.util.*;
public class Encoding {
    private String text;
    private int offset;

    public Encoding(String text, int offset) {
        this.text = text;
        this.offset = offset;
    }
    public String getText(){
        return this.text;
    }

    public int getShift(){
        return this.offset;
    }
    public static String encrypting(String text, int offset ){
        String ciphertext = "";
        char alphabet;
        for(int i=0; i < text.length();i++)
        {
            alphabet = text.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet + offset);
                if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + offset);

                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else {
                ciphertext = ciphertext + alphabet;
            }

        }
        return ciphertext;
    }
}
