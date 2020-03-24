import Organs.Heart;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeartTest {

    Heart heart;

    @Before
    public void before(){
        heart = new Heart("heart", "bloodflow");
    }

    @Test
    public void canGetBloodflow(){
        assertEquals("bloodflow", heart.getPurpose());
    }

    @Test
    public void canBeat(){
        assertEquals("ba-dum, ba-dum, ba-dum", heart.beat());
    }

    @Test
    public void canHeal(){
        heart.heal(5);
        assertEquals(15, heart.getVitality());
    }
}
