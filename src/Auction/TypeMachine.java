package Auction;

public class TypeMachine extends Things implements Write{

    private Boolean goodTyping = true;

    public void setGoodTypingFalse() {
        goodTyping = false;
    }

    @Override
    public void write() {
        if (goodTyping == true) {
            System.out.println("Печатает хорошо");
        } else {
            System.out.println("Не работает");
        }
    }

    public TypeMachine(double price, String name){
        super(price, name);
    }
}