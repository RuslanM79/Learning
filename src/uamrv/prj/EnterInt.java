package uamrv.prj;
// Класс ввода целого числа
// Вовзращает целое число, проверя ввод пока не будет корреткного

import java.util.Scanner;


public class EnterInt {

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

