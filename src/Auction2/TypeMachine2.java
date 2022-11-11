package Auction2;

public class TypeMachine2 extends Things2 implements Write2 {

        @Override
        public void write2() {
            if (getCondition() == true) {
                System.out.println("Печатает хорошо");
            } else {
                System.out.println("Не работает");
            }
        }

        public TypeMachine2(double price, String name, boolean condition){
            super(price, name, condition);
        }
    }
