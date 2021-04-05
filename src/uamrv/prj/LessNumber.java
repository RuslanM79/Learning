package uamrv.prj;
/*
Создать программу,
которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
Для вычисления модуля используйте тернарную условную операцию.
 */


import java.util.Scanner;

public class LessNumber {


    public static void main(String[] args) {

        double d1;
        double d2;
        double d3;

        double dd1;
        double dd2;
        double dd3;


        EnterDouble enterDouble = new EnterDouble();
        System.out.println("Enter first number: ");
        d1 = enterDouble.GetDouble();
        System.out.println("Enter second number: ");
        d2 = enterDouble.GetDouble();
        System.out.println("Enter third number: ");
        d3 = enterDouble.GetDouble();

        dd1 = d1 < 0 ? -d1 : d1;
        dd2 = d2 < 0 ? -d2 : d2;
        dd3 = d3 < 0 ? -d3 : d3;

        if (dd1 < dd2 & dd1 < dd3) {
            System.out.println("The less number by module is first: " + d1);
        } else if (dd2 < dd1 & dd2 < dd3) {
            System.out.println("The less number by module is second: " + d2);
        } else if (dd3 < dd1 & dd3 < dd2) {

            System.out.println("The less number by module is third " + d3);
        }


    }

// Checking for entering real number (with point or without) and convert it to double

    public static class EnterDouble {

        private double d;

        public Double GetDouble() {


            boolean checkDouble;


            do {
                Scanner scanner = new Scanner(System.in);


                checkDouble = scanner.hasNextDouble();


                if (checkDouble) {
                    d = scanner.nextDouble();
                } else {
                    System.out.println("Your enter is wrong, you need enter number");
                }


            }

            while (!checkDouble);
            return d;
        }
    }
}
