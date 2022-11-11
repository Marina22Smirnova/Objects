package Family;

import Family.Children;

public class Parents {

    public void play(Children kid) {
        if (kid.enjoy()==true) {
            System.out.println("С ребенком поиграли, ребенок доволен");
        }
        else{
            System.out.println("С ребенком не поиграли, ребенок грустит");
        }
    }
}
