public class Main
{
    public static void main(String[] args)
    {
        System.out.println( " Тут через цикл For");

        String a = "114";

        for (int i = 0; i < 50 ; i ++ )
        {
            System.out.println( a );
        }

        System.out.println( " Тут через цикл While");

        int b = 0;
        while ( b < 50 )
        {
            System.out.println(a);
            b++ ;
        }


    }
}