package b5_AdvancedObjectOrientedDesign.TH.LopAnimalVaInterFaceEdible.animal;

public class Chiken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howtoeat() {
        return "could be fried";
    }
}
