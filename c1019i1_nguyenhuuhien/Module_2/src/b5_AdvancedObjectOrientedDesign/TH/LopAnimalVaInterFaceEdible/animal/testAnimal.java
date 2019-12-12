package b5_AdvancedObjectOrientedDesign.TH.LopAnimalVaInterFaceEdible.animal;

public class testAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chiken) {
                Edible edibler = (Chiken) animal;
                System.out.println(edibler.howtoeat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoeat());
        }

    }
}
