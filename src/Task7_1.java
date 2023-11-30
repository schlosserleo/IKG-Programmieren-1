public class Task7_1 {
    public static void main(String[] args) {
        char[] sequence = {'G', 'A', 'T', 'T', 'A', 'C', 'A'};
        int numPur = countPurines(sequence);
        int numPyr = countPyrimidines(sequence);
        System.out.println(numPyr + " " + numPur);
    }

    public static int countBases(char[] sequence, char toFind) {
        int count = 0;
        for (char x : sequence) {
            if (x == toFind) count++;
        }
        return count;
    }

    public static int[] countBases(char[] sequence) {
        int[] result = new int[4];
        for (char x : sequence) {
            if (x == 'A') {
                result[0]++;
            } else if (x == 'C') {
                result[1]++;
            } else if (x == 'G') {
                result[2]++;
            } else if (x == 'T') {
                result[3]++;
            }
        }
    }

    public static int countPurines(char[] sequence) {
        return countBases(sequence, 'A') + countBases(sequence, 'G');
    }

    public static int countPyrimidines(char[] sequence) {
        return countBases(sequence, 'T') + countBases(sequence, 'C');
    }


}
