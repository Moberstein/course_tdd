import org.junit.Test;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void regularDivision()
    {
        assertEquals(new Division("9", "3").divide(), "3");
    }

    @Test
    public void divideZero()
    {
        assertEquals(new Division("5", "0").divide(), "ERROR: Divide by zero");
    }
}