public class Task3_4 {
    public static void main(String[] args) {
        int n = 1;
        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            if (j < 5) {
                n++;
            } else {
                n--;
            }
            System.out.println();
        }
    }
}