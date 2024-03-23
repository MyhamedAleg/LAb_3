import java.util.Scanner;
public class Tab2
{
    public static double function (double i)
    {
        return (Math.sqrt(Math.pow(i, 3)) + i + 1.5) / (i + 1);
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner (System.in) ;

        int X = scn.nextInt(),Y = scn.nextInt();
        double res = 0 ;    // Лічильник
        double step = 0.2 ; // Крок

        double i = 0 ;
        while ( i <= 4  )
        {
            double result = function(i);
            System.out.print ("f = ");
            System.out.printf ("%.3f ",i );
            System.out.print ("= ");
            System.out.printf("%.3f \n ",result);
            if ( result >= X && result <= Y )
            {
                res++;
            }
            i +=step;
        }
        if (res == 0)
        {
            System.out.println("Немає значень функції у вказаному діапазоні.");
        }
        else
        {
            System.out.println("Кількість значень функції у вказаному діапазоні: " + res);
        }

    }
}