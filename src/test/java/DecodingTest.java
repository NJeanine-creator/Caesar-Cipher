import org.junit.Test;

import static org.junit.Assert.*;

public class DecodingTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Decoding testDecoding = new Decoding("Hello", 4);
        assertEquals(true, testDecoding instanceof Decoding);
    }

    @Test
    public void newDecode_getsciphertext() {
        Decoding testDecode = new Decoding("Hello", 4);
        assertEquals("Hello", testDecode.getCiphertext());
    }

    @Test
    public void getshift_getsDecodeshift() {
        Decoding testDecode = new Decoding("Hello", 4);
        assertEquals(4, testDecode.getShift());
    }
    @Test
    public void testdecryption() {

        int shift = 1;
        String ciphertext = "kfbojof";
        String expected = "jeanine";
        assertEquals(expected, Decoding.decrypting( ciphertext,shift));
    }

}