package uamrv.prj;
/*
Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
а) метод, который будет мигать лампочками гирлянды заданное количество раз (операция ~);
б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
г) метод, который будет распечатывать текущее состояние гирлянды.
Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a)
 */


import java.util.Random;
import java.util.Scanner;


public class Garland {

    int stance;

    public int getStance() {
        return stance;
    }

    public void setStance(int stance) {
        this.stance = stance;
    }

    public void on() { // включает гирлянду (выводит побитово в окно вывода)

        System.out.println(Integer.toBinaryString(getStance()));
    }

    public void flash() { // меняет включенные на выключенные и выводи текущее состояние подитово

        setStance(~this.stance); //Смена 0 на 1 и наоборот
        on();
    }

    public void moveRigt() { // бегущая срока в право
        this.stance = this.stance >> 1;
    }

    public void moveLeft() {  // бегущая срока в лево
        this.stance = this.stance << 1;
    }

    public void checkFirstBit() {  // проверка первого бита, 1 или 0
        if ((this.stance&0B01) == 0){
            System.out.println("First bit is o");
        }
        else {
            System.out.println("First bit is 1");
        }
    }



    //Метод мигания герляндой
    //Метод спрашивет, сколько раз надо мигать герляндой
    //Проверяет, чтобы ответ был целым и положительным числом
    //Затем меняет биты в герлянде с о на 1 и наоборот заданное число раз
    public void askFlashing(Garland garland) {
        int times;
        EnterInt enterInt = new EnterInt();

        System.out.println("How much times has Garland to flash? ");

        do {
            times = enterInt.GetInt();
            if (times <= 0) {
                System.out.println("The number mast be more 0, please enter again");
            }
        }
        while (times <= 0);

        do {
            garland.flash();

            times -= 1;

        }
        while (times >= 1);
    }

    // Класс ввода целого числа
    // Вовзращает целое число, проверяя ввод пока не будет корреткного
    public static class EnterInt {

        private int d;

        public Integer GetInt() {

            boolean check;

            do {
                Scanner scanner = new Scanner(System.in);

                check = scanner.hasNextInt();
                if (check) {
                    d = scanner.nextInt();
                } else {
                    System.out.println("Your enter is wrong, you need enter integer number");


                }
            }
            while (!check);
            return d;
        }

    }

    // Метод опроса, что сделать с герляндой.
    // Возвращает число с выбором поользователя, проверяет на соответствеие разрешенному вводу
    public int watToDo() {
        int answer;

        boolean check;

        EnterInt enterInt = new EnterInt();
        System.out.println("What do you want to do? ");
        System.out.println("Flash the garland - press 1? ");
        System.out.println("Run to the right - press 2? ");
        System.out.println("Run to the left - press 3? ");
        System.out.println("Check first lamp, 1 or 0 - press 4? ");
        System.out.println("Print current stance of the garland - press 5? ");
        System.out.println("Exit - press 6? ");

        do {

            check = true;
            answer = enterInt.GetInt();
            if ((answer <= 0) | (answer >= 7)) {
                System.out.println("The number mast be 1-6, please enter again");
                check = false;
            }
        }
        while (!check);
        return answer;
    }

    public static void main(String[] args) {

        Random random = new Random();
        Garland garland = new Garland();

        int choose; //будет хранить значение выбора действия
        int st = random.nextInt(); // получаем случайное целое число

     //   st = st * st; // избавляемся от отрицательного значения

        garland.setStance(st);

        garland.on(); //вывод текущего состояния


        do {
            choose = garland.watToDo();

            if (choose == 1) {
                garland.askFlashing(garland);
            }
            if (choose == 2) {
                garland.moveRigt();
                garland.on();
            }
            if (choose == 3) {
                garland.moveLeft();
                garland.on();
            }
            if (choose == 4) {
                garland.checkFirstBit();
            }
            if (choose == 5) {
                garland.checkFirstBit();
                garland.on();
            }

        }
        while (choose != 6);

    }


}