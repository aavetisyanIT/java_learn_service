import java.util.Arrays;

public class WeekDays {
    public static void main(String[] args) {
        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println(weekDays.length);
        System.out.println(weekDays[3]);
        System.out.println(Arrays.deepToString(ticTacToe));
        System.out.println(ticTacToe[2][2]);
        myStrMethod("test", "test1");
    }

    public int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static String[][] ticTacToe = {{"o", "x", "x"}, {"x", "o", "o"}, {"x", "o", "o"}};

    public static void myStrMethod(String... args) {
        System.out.println(Arrays.deepToString(args));
    }

}
