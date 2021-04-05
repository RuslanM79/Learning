package uamrv.prj;
/*
Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нет.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */

import java.util.Scanner;

public class CheckOdd {


    public static void main(String[] args) {

        int dd;
        int f;
        EnterInt enterInt = new EnterInt();

        System.out.print("Enter integer number: ");
        dd = enterInt.GetInt();
        f = (int) Math.sqrt(dd * dd);
        f = f % 2;
        if (f > 0) {
            System.out.println("The entered number is odd and is: " + dd);
        } else {
            System.out.println("The entered number is even and is: " + dd);
        }

    }


    // класс проверки введенных данных на соответствие целому числу
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

}


