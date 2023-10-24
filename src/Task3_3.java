public class Task3_3 {
    public static void main(String[] args) {
        int n = 7;
        for (int j = 1; j <= 7; j++) {
            if (n != 5) {
                for (int i = 1; i <= n; i++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= n; k++) {
                    System.out.print(".");
                }
            }
            System.out.println();
            n--;
        }
    }
}
