package DemoInterface;

public class MainFly {

    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.fly();
        bird.fall();

        Plane plane = new Plane();
        plane.fly();
        plane.fall();

        Balloon balloon = new Balloon();
        balloon.fly();
        balloon.fall();
    }
}
