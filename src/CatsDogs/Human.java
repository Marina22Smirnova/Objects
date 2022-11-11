package CatsDogs;

import CatsDogs.AnimalClass;

public class Human {

    public void feed(AnimalClass animal) {
        System.out.println("Животное покормили");
            if(animal.eat()==false) {
                System.out.println("Животное уже наелось");
        }
    }
}