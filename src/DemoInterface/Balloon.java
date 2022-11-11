package DemoInterface;

public class Balloon implements FlyingMethods{

    @Override
    public void fall(){
        System.out.println("Пора купить новый шарик!");
    }
}
