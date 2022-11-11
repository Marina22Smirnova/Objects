package Family;

import Family.Children;

public class FamilyProgram {

    public static void main(String[] args) {
        Children dima = new Children("Дима", 12, true);
        Children nastya = new Children("Настя", 8, false);
        Children julia = new Children("Юля", 4, true);
        Parents mom = new Parents();
        Parents dad = new Parents();

        System.out.printf("Имя %s, возраст %d \n", dima.getName(), dima.getAge());
        mom.play(dima);

        System.out.printf("Имя %s, возраст %d \n", nastya.getName(), nastya.getAge());
        dad.play(nastya);
        nastya.enjoy();
        System.out.printf("Имя %s, возраст %d \n", julia.getName(), julia.getAge());
        dad.play(julia);
        julia.enjoy();
    }

}
