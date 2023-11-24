public class Task4_B_1_1 {

    public static void main(String[] args) {
        printHarmonicSeriesFormula(2);
    }

    public static double getHarmonicSeriesAt(int n) {
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += 1.0 / i;
        }
        return result;
    }

    public static void printHarmonicSeriesFormula(int n) {
        if (n <= 0) {
            System.out.print("0.0");
            return;
        }
        System.out.print("1");
        for (int i = 2; i < n + 1; i++) {
            System.out.printf(" + (1/%s)", i);
            if ((i % 10) == 0) {
                System.out.println();
            }
        }
        System.out.print(" = " + getHarmonicSeriesAt(n));
    }
}
