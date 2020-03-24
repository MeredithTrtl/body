import Limbs.Leg;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LegTest {

    Leg leg;

    @Before
    public void before(){
        leg = new Leg("right leg", 10);
    }

    @Test
    public void canGetEnergy(){
        assertEquals(leg.getEnergyLevel(), 10);
    }

    @Test
    public void canTakeStep(){
        leg.step();
        assertEquals(leg.getEnergyLevel(), 9);
    }

    @Test
    public void canDoBigJump(){
        leg.jump();
        assertEquals(leg.getEnergyLevel(), 8);

    }
}
