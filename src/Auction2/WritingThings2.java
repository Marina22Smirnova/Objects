package Auction2;

public class WritingThings2 extends Things2 implements Write2 {

        @Override
        public void write2() {
            if (getCondition() == true) {
                System.out.println("Пишет хорошо");
            } else {
                System.out.println("Не пишет");
            }
        }

        public WritingThings2(double price, String name, boolean condition) {
            super(price, name, condition);
        }
    }
