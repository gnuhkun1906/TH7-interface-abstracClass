package th1.animal;

import th1.edible.IEedible;

public class Chicken extends Animal implements IEedible {
    @Override
    public String makeSound() {
        return "Chicken: gà gà";
    }

    @Override
    public String howToEat() {
        return "ngon qa";
    }
}
