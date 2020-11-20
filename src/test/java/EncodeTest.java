import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Encode testEncode = new Encode("Hello", 4);
        assertEquals(true, testEncode instanceof Encode);
    }

    @Test
    public void newEncode_getsplaintext() {
        Encode testEncode = new Encode("Hello", 4);
        assertEquals("Hello", testEncode.getPlaintext());
    }

    @Test
    public void getshift_getsEncodeshift() {
        Encode testEncode = new Encode("Hello", 4);
        assertEquals(4, testEncode.getShift());
    }
    @Test
    public void testencryption() {

        int shift = 1;
        String plaintext = "jeanine";
        String expected = "kfbojof";
        assertEquals(expected, Encode.encrypting( plaintext,shift));
    }

}