public class Clock2 {
    public static void main(String[] args) {
        int hour = 2;
        int minute = 60;

        int i = 0;
        while (i <= hour) {
            int l = 0;
            while (l < minute) {
                System.out.println("hour " + (i) + " minute " + (l));
                l++;
            }
            i++;
        }
    }
}