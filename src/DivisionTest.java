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

    @Test
    public void nullValues()
    {
        assertEquals(new Division(null, "3", 3).divide(), "ERROR: NULL Value");
        assertEquals(new Division("3", null, 3).divide(), "ERROR: NULL Value");
    }

    @Test
    public void whitespace()
    {
        assertEquals(new Division(" ", "3", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("\t", "3", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("\r", "3", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("\n", "3", 3).divide(), "ERROR: Empty Value");
        
        assertEquals(new Division("3", " ", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("3", "\t", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("3", "\r", 3).divide(), "ERROR: Empty Value");
        assertEquals(new Division("3", "\n", 3).divide(), "ERROR: Empty Value");
    }
}