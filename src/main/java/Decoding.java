public class Decoding{
    private String ciphertext;
    private int shift;

    public Decoding(String ciphertext, int shift) {
        this.ciphertext = ciphertext;
        this.shift = shift;
    }

    public static String decrypting(String decrypting) {
        String text = new String();
        return text;
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
            char alphabet = ciphertext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {

                alphabet = (char) (alphabet - shift);

                if(alphabet < 'a') {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - shift);

                if (alphabet < 'A') {

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