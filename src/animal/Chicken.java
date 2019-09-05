package animal;

import ediable.Ediable;

public class Chicken extends Animal implements Ediable {
    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "Chicken could be fried";
    }
}
