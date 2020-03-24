import Limbs.Arm;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmTest {

    Arm arm;

    @Before
    public void before(){
      arm = new Arm("left arm", 4);
    }

    @Test
    public void canGetArmName(){
        assertEquals("left arm", arm.getName());
    }

    @Test
    public void canDoCoolMove(){
        arm.wave();
        assertEquals(arm.getEnergyLevel(), 2);
    }

}
