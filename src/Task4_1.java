public class Task4_1 {
    public static void main(String[] args) {
        System.out.print(getMax(7, 2, 3));
        System.out.print(uppercaseChar('a'));
        System.out.print(uppercaseChar('K'));
        System.out.println(uppercaseChar('@'));
        for (int i = 1; i <= 50; i++) {
            System.out.print(i + ": ");
            System.out.println(fibonacci(i));
        }


    }

    public static int getMax(int a, int b, int c) {
        int biggest = a;
        if (b > biggest) biggest = b;
        if (c > biggest) {
            biggest = c;
        }
        return biggest;
    }

    public static char uppercaseChar(char a) {
        if ((int) a >= 97 && (int) a <= 122) {
            return (char) ((int) a - 32);
        } else if ((int) a >= 65 && (int) a <= 90) {
            return a;
        } else {
            return 0;
        }
    }

    public static int fibonacci(int n) {
        int a, b, c;
        a = b = c = 1;
        if (n > 46) {
            return -1;
        }
        if (n <= 2) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
