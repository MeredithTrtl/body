import Actions.IFrankenstein;
import Limbs.Limb;
import Organs.Organ;

import java.util.ArrayList;

public class Body {

    private ArrayList<IFrankenstein> bits;

    public Body(){
        this.bits = new ArrayList<IFrankenstein>();
    }

    public ArrayList<IFrankenstein> getBits() {
        return bits;
    }

    public int getBitCount(){
        return this.bits.size();
    }

    public void addBodyPart(IFrankenstein bit){
        this.bits.add(bit);
    }

}
