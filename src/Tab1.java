import java.util.Scanner;

public class Tab1 {
    public static double function(double i) {
        return (Math.sqrt(Math.pow(i, 3)) + i + 1.5) / (i + 1); // виправлений вираз
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int X = scn.nextInt(),Y = scn.nextInt();

        double res = 0;    // Лічильник
        double step = 0.2; // Крок

        System.out.println("Проміжок значень i від 0 до 4:");

        for (double i = 0; i <= 4; i+= step) {
            double result = function(i);
            System.out.print("f = ");
            System.out.printf("%.3f", i);
            System.out.print(" = ");
            System.out.printf("%.3f \n", result);
            if (result >= X && result <= Y) {
                res++;
            }
        }

        if (res == 0) {
            System.out.println("Немає значень функції у вказаному діапазоні.");
        } else {
            System.out.println("Кількість значень функції у вказаному діапазоні: " + res);
        }
    }
}
