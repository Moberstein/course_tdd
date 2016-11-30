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

    @Test
    public void differentPrecisions()
    {
        assertEquals(new Division("1", "3", 0).divide(), "0");
        assertEquals(new Division("1", "3", 1).divide(), "0.3");
        assertEquals(new Division("1", "3", 2).divide(), "0.33");
        assertEquals(new Division("1", "3", 3).divide(), "0.333");
    }
}