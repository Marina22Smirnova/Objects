package Auction;

public class WritingThings extends Things implements Write {

    private Boolean goodwriting = true;

    public void setGoodwritingFalse() {
        goodwriting = false;
    }

    @Override
    public void write() {
        if (goodwriting == true) {
            System.out.println("Пишет хорошо");
        } else {
            System.out.println("Не пишет");
        }
    }

    public WritingThings(double price, String name) {
        super(price, name);
    }
}
