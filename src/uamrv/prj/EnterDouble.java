package uamrv.prj;

import java.util.Scanner;

// Checking for entering real number (with point or without) and convert it to double

public class EnterDouble {

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
        return  d;
    }
}
