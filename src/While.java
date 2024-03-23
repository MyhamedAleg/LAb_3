public class While
{
    public static void main(String[] args) {

        int hour = 2 ;
        int minute = 60 ;
        int second = 60 ;
        for (int i = 0; i <=hour; i++)
        {
            for (int l = 0; l < minute; l++)
            {
                for (int p = 0; p < minute; p++)
                {
                    System.out.println("hour " + (i) + " minute " + (l) + " second " + ( p));
                }
            }

        }

    }
}