package Auction;

public class Human {


    public void checkType(TypeMachine tm) {
            tm.write();
        }
    public void checkWrite(WritingThings wt){
           wt.write();
       }

    public void writeWTinfo(WritingThings wt){
        System.out.printf("Цена: %.2f, название: %s \n",wt.getPrice(), wt.getName());
    }

    public void writeTMinfo(TypeMachine tm){
        System.out.printf("Цена: %.2f, название: %s \n",tm.getPrice(), tm.getName());
    }

    public void buyWT(WritingThings wt){
        System.out.printf("Экспонат %s куплен по цене %.2f \n",wt.getName(),wt.getPrice());
        System.out.println("");
    }

    public void buyTM(TypeMachine tm){
        System.out.printf("Экспонат %s куплен по цене %.2f \n",tm.getName(),tm.getPrice());
        System.out.println("");
    }
}
