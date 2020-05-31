package numberswapper;

public class NumberSwapper {

    public static void swapTwoNumbers(int x, int y) {
        x = x + y; //x = 100 + 200 = 300
        y = x - y; //y = 300 - 200 = 100
        x = x - y; //x = 300 - 100 = 200
        System.out.println("a is now : " + x);
        System.out.println("b is now: " + y);
    }
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        swapTwoNumbers(a, b);
    }
}
