package Demo;

public class Main {

    public static void main(String[] args) {
        Animal newAnimal = new Animal(3, "Мурка");

        newAnimal.setName("Котя");
        newAnimal.setLegs(4);
        System.out.println("Имя "+ newAnimal.getName());

        System.out.printf("Количество ног %d \n", newAnimal.getLegs());
        System.out.println("Голодный "+ newAnimal.getHungry());

        newAnimal.eat();
        System.out.println("Голодный "+ newAnimal.getHungry());

        newAnimal.eat();

    }
}
