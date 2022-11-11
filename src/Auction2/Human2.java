package Auction2;

public class Human2 {

    public void checkType(TypeMachine2 tm) {
        tm.write2();
    }
    public void checkWrite(WritingThings2 wt){
        wt.write2();
    }

    public void writeWTinfo(WritingThings2 wt) {
        if (wt.getCondition() == true) {
            System.out.printf("Цена: %.2f, название: %s, состояние хорошее \n", wt.getPrice(), wt.getName());
        }else{
        }
    }
    public void writeTMinfo(TypeMachine2 tm) {
        if (tm.getCondition()==true){
            System.out.printf("Цена: %.2f, название: %s , состояние хорошее \n", tm.getPrice(), tm.getName());
        }else{
        }
    }
    public void buyWT(WritingThings2 wt) {
        if (wt.getCondition() == true) {
            System.out.printf("Экспонат %s куплен по цене %.2f \n", wt.getName(), wt.getPrice());
            System.out.println("");
        }
        else {
        }
    }
    public void buyTM(TypeMachine2 tm) {
        if (tm.getCondition() == true) {
            System.out.printf("Экспонат %s куплен по цене %.2f \n", tm.getName(), tm.getPrice());
            System.out.println("");
        } else {
        }
    }
}
