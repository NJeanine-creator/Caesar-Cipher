import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Decode testDecode = new Decode("Hello", 4);
        assertEquals(true, testDecode instanceof Decode);
    }

    @Test
    public void newDecode_getsciphertext() {
        Decode testDecode = new Decode("Hello", 4);
        assertEquals("Hello", testDecode.getCiphertext());
    }

    @Test
    public void getshift_getsDecodeshift() {
        Decode testDecode = new Decode("Hello", 4);
        assertEquals(4, testDecode.getShift());
    }
    @Test
    public void testdecryption() {

        int shift = 1;
        String ciphertext = "kfbojof";
        String expected = "jeanine";
        assertEquals(expected, Decode.decrypting( ciphertext,shift));
    }

}