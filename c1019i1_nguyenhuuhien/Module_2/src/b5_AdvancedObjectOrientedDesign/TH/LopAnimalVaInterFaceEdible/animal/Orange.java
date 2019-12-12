package b5_AdvancedObjectOrientedDesign.TH.LopAnimalVaInterFaceEdible.animal;

public class Orange extends Fruit implements Edible {
    @Override
    public String howtoeat() {
        return "Orange could be juiced .";
    }
}
