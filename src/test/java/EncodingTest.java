import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class EncodingTest {
    @Test
    public void newEncode_instantiatesCorrectly() {

        Encoding testEncode = new Encoding("Hello", 4);
        assertEquals(true, testEncode instanceof Encoding);
    }

    @Test
    public void newEncode_getsplaintext() {
        Encoding testEncode = new Encoding("Hello", 4);
        assertEquals("Hello", testEncode.getText());
    }

    @Test
    public void getshift_getsEncodeshift() {
        Encoding testEncode = new Encoding("Hello", 4);
        assertEquals(4, testEncode.getShift());
    }
    @Test
    public void testencryption() {

        int offset = 1;
        String text = "jeanine";
        String expected = "kfbojof";
        assertEquals(expected, Encoding.encrypting( text,offset));
    }

}