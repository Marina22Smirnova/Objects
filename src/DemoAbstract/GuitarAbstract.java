package DemoAbstract;

public class GuitarAbstract extends InstrumentsAbstract{

    @Override
    public void play(){
        System.out.println("Играет");
    }

    @Override
    public void set() {
        System.out.println("Настраивается");
    }
}
