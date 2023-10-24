public class Task3_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if ((i % 2) != 0) {
                for (int j = 1; j <= 7; j++) {
                    System.out.print("*");
                }
            } else {
                for (int k = 1; k <= 7; k++) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
