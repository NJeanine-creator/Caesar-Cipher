import static org.junit.Assert.*;

public class EncodeTest {
    @Test
    public void newRectangle_instantiatesCorrectly() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(true, testRectangle instanceof Rectangle);
    }

    @Test
    public void newRectangle_getsHeight_2() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(2, testRectangle.getHeight());
    }

    @Test
    public void getWidth_getsRectangleWidth_4() {
        Rectangle testRectangle = new Rectangle(2, 4);
        assertEquals(4, testRectangle.getWidth());
    }

}