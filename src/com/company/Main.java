public class Main{

    public static void main(String args[]){

        if (args.length == 3)
        {
            //output decrypted string
            System.out.println(decryptString(args[0], args[1], args[2]));
        }
        else
        {
            // show usage message
            System.out.println("usage: java CaesarCipher <encrypted answer> <decrypted answer> <encrypted string>");
        }

    } // end main

    private static String decryptString(String encryptedAnswer, String decryptedAnswer, String encryptedString )
    {
        char[] letters = { 'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z' };

        // calculate difference between letters
        char enfirst = encryptedAnswer.toLowerCase().charAt(0);
        char defirst = decryptedAnswer.toLowerCase().charAt(0);

        // cast to int
        int e = (int) enfirst;
        int d = (int) defirst;

        // get difference between the 2 letters
        int diff = d - e;

        StringBuffer decryptedString = new StringBuffer();

        // decrypt string
        for (int i = 0; i < encryptedString.length(); i++)
        {
            // get current char
            char curChar = encryptedString.charAt(i);

            if (curChar != ' ' && curChar != ',' && curChar != '-')
            {
                // get number of current char
                int curCharInt = (int) curChar;

                // get position of decrypted char
                int posOfCharInLettersArray = ((curCharInt - 97 + diff) % letters.length + letters.length) % letters.length;

                // get decrypted char
                char newChar = letters[posOfCharInLettersArray];

                // build output string
                decryptedString.append(newChar);
            }
            else
            {
                // build output string
                decryptedString.append(curChar);
            }
        }

        return decryptedString.toString();
    } // end decryptString

} // end class