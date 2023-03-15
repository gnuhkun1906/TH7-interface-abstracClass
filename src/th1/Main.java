package th1;

import th1.animal.Animal;
import th1.animal.Chicken;
import th1.animal.Tiger;
import th1.edible.IEedible;
import th1.fruit.Apple;
import th1.fruit.Fruit;
import th1.fruit.Orange;

public class Main {
    public static void main(String[] args) {
        Animal animal[]=new Animal[2];
        animal[0]=new Tiger();
        animal[1]=new Chicken();
        for (Animal animals:animal){
            System.out.println(animals.makeSound());
           if (animals instanceof Chicken){
               IEedible edible=(Chicken) animals;
               System.out.println(edible.howToEat());
           }
        }
        Fruit fruit[]=new Fruit[2];
        fruit[0]=new Apple();
        fruit[1]=new Orange();
        for (Fruit fruit1:fruit){
            System.out.println(fruit1.howToEat());
        }

    }
}
