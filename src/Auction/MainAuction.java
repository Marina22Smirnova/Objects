package Auction;

public class MainAuction {

    public static void main(String[] args) {

        TypeMachine tm1 = new TypeMachine(100, "Gloria");
        TypeMachine tm2 = new TypeMachine(120, "Elsa");
        WritingThings pen = new WritingThings(2, "Bic");
        WritingThings pencil = new WritingThings(5, "Kohinoor");

        Human performer = new Human();
        Human buyer1 = new Human();
        Human buyer2 = new Human();
        Human buyer3 = new Human();

        performer.checkType(tm1);
        performer.writeTMinfo(tm1);
        buyer1.checkType(tm1);
        buyer1.buyTM(tm1);

        performer.checkType(tm2);
        performer.writeTMinfo(tm2);
        buyer2.checkType(tm2);
        buyer2.buyTM(tm2);

        pen.setGoodwritingFalse();
        performer.checkWrite(pen);
        System.out.println("");

        performer.checkWrite(pencil);
        performer.writeWTinfo(pencil);
        buyer3.checkWrite(pencil);
        buyer3.buyWT(pencil);

    }
}
