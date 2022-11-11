package Auction2;

public class MainAuction2 {

    public static void main(String[] args) {

        TypeMachine2 tm1 = new TypeMachine2(100, "Gloria", true);
        TypeMachine2 tm2 = new TypeMachine2(120, "Elsa",true);
        WritingThings2 pen = new WritingThings2(2, "Bic",false);
        WritingThings2 pencil = new WritingThings2(5, "Kohinoor", true);

        Human2 performer = new Human2();
        Human2 buyer1 = new Human2();
        Human2 buyer2 = new Human2();
        Human2 buyer3 = new Human2();

        performer.checkType(tm1);
        performer.writeTMinfo(tm1);
        buyer1.checkType(tm1);
        buyer1.buyTM(tm1);

        performer.checkType(tm2);
        performer.writeTMinfo(tm2);
        buyer2.checkType(tm2);
        buyer2.buyTM(tm2);


        performer.checkWrite(pen);
        performer.writeWTinfo(pen);
        buyer3.checkWrite(pen);
        buyer3.buyWT(pen);

        performer.checkWrite(pencil);
        performer.writeWTinfo(pencil);
        buyer3.checkWrite(pencil);
        buyer3.buyWT(pencil);

    }
}
