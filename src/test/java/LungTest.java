import Organs.Heart;
import Organs.Lungs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LungTest {

    Lungs lungs;

    @Before
    public void before(){
        lungs = new Lungs("lungs", "breathing");
    }

    @Test
    public void canGetPurpose(){
        assertEquals("breathing", lungs.getPurpose());
    }

    @Test
    public void canBreathe(){
        assertEquals("whooooosh", lungs.breathe());
    }

    @Test
    public void canHeal(){
        lungs.heal(5);
        assertEquals(15, lungs.getVitality());
    }
}
