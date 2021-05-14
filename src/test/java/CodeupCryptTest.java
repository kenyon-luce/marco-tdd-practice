import org.junit.Test;
import static org.junit.Assert.*;

public class CodeupCryptTest {

    @Test
    public void testIfVersionSet(){
//        assertEquals(0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 1.5;
        assertEquals(1.5, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword(){
        assertEquals("f3r", CodeupCrypt.password("fer"));
    }
//    @Test
//    public void testPasswordWorking(){
//        assertEquals(CodeupCrypt.checkPassword("fer"), "fer");
//    }
}
