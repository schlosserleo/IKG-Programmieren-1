public class Task5_1 {
    public static void main(String[] args) {
        double[] ages = {20, 45, 69, 70, 45, 16, 59, 45, 24, 54, 53, 65, 61, 3, 48, 47, 13, 85, 27, 69, 45, 20, 67, 63, 18, 56, 25, 35, 35, 24, 70, 65, 34, 32, 23, 67, 53, 35, 33, 38, 22, 27, 69, 64, 36, 27, 51, 48, 46, 85, 38, 41, 24, 22, 73, 69, 23, 41, 32, 40, 65, 56, 47, 65, 70, 23, 65, 37, 63, 59, 26, 63, 69, 23, 24, 33, 35, 70, 36, 53, 35, 1, 60, 22, 18, 21, 21, 23, 70, 32, 38, 18, 74, 21, 20, 44, 38, 21, 42, 68, 29, 58, 1, 51, 45, 32, 34, 24, 48, 35, 26, 73, 75, 67, 67, 65, 44, 62, 75, 60, 1, 80, 72, 71, 65, 66, 55, 22, 50, 80, 50, 45};
        char[] stati = {'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'};
        double[] recoveredMetrics = metrics(select(ages, filter(stati, 'r')));
        double[] deceasedMetrics = metrics(select(ages, filter(stati, 'd')));
        System.out.println("Verstorben - Min: " + deceasedMetrics[0] + ", Max: " + deceasedMetrics[1] + ", Mean: " + deceasedMetrics[2]);
        System.out.println("Genesen - Min: " + recoveredMetrics[0] + ", Max: " + recoveredMetrics[1] + ", Mean: " + recoveredMetrics[2]);
    }

    public static double[] metrics(double[] values) {
        double smallest, biggest;
        smallest = biggest = values[0];
        double avg, sum;
        sum = 0;
        for (double x : values) {
            if (x <= smallest) {
                smallest = x;
            } else if (x >= biggest) {
                biggest = x;
            }
            sum += x;
        }
        avg = sum / values.length;
        return new double[]{smallest, biggest, avg};
    }

    public static int[] filter(char[] values, char toSelect) {
        int count = 0;
        for (char x : values) {
            if (x == toSelect) {
                count++;
            }
        }

        int[] result = new int[count];
        count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == toSelect) {
                result[count] = i;
                count++;
            }
        }
        return result;
    }

    public static double[] select(double[] values, int[] indices) {
        double[] result = new double[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[i] = values[indices[i]];
        }
        return result;
    }
}