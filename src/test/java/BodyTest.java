import Limbs.Arm;
import Limbs.Leg;
import Organs.Heart;
import Organs.Lungs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;
    Heart heart;
    Lungs lungs;
    Arm rightArm;
    Arm leftArm;
    Leg rightLeg;
    Leg leftLeg;

    @Before
    public void before(){
        body = new Body();
        heart = new Heart("heart", "beating");
        lungs = new Lungs("lungs", "breathing");
        rightArm = new Arm("right arm", 20);
        leftArm = new Arm("left arm", 18);
        rightLeg = new Leg("right leg", 40);
        leftLeg = new Leg("left leg", 44);
    }

    @Test
    public void bodyStartsEmpty(){
        assertEquals(0, body.getBitCount());
    }

    @Test
    public void canAddBitsToBody(){
        body.addBodyPart(heart);
        body.addBodyPart(lungs);
        body.addBodyPart(rightArm);
        body.addBodyPart(leftArm);
        body.addBodyPart(rightLeg);
        body.addBodyPart(leftLeg);
        assertEquals(6, body.getBitCount());
    }


}
