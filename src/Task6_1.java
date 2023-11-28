public class Task6_1 {
    public static void main(String[] args){
        System.out.println(isSafe(100,200, 'a'));
        System.out.println(isSafe(-2000000000, 200000000, 's'));
        for (int i = 0; i <= 30; i++){
            System.out.println(i + ": " + isPrime(i));
        }
        System.out.println(countPrimes(0,30));
    }
    public static int compare(int x, int y){
        if (x < y) return -1;
        else if (x == y) return 0;
        else return 1;
    }
    public static boolean isSafe(int a, int b, char operation){
        if (operation == 'a') {
            return !((double) a + (double) b > 2147483647);
        } else if(operation == 's') {
            return !((double) a - (double) b < -2147483647);
        }
        return false;
    }
    public static boolean isPrime(int val){
        if (val <= 1) return false;
        for (int i = 2; i < val; i++){
            if ((double) (val / i) == (double) val / (double) i) return false;
        }
        return true;
    }
    public static int countPrimes(int from, int to){
        int counter = 0;
        for (int i = from; i <= to; i++){
            if (isPrime(i)) counter++;
        }
        return counter;
    }
}

