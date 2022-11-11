package CatsDogs;

public class AnimalClass {

    private boolean hungry;

    public void setHungry() {
        this.hungry = true;
        System.out.println("Животное проголодалось");
    }

    public Boolean eat() {
        if (hungry = true){
        this.hungry = false;
        System.out.println("Животное сытое");
        }
        else{
            System.out.println("Животное наелось");
        }
        return hungry;
    }
}
