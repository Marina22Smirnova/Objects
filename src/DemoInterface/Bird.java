package DemoInterface;

public class Bird implements FlyingMethods{

    @Override
    public void fall(){
        System.out.println("Берегитесь!");
    }
}
