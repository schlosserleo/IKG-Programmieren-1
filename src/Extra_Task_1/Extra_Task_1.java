package Task7_1;

public class Extra_Task_1 {
    public static void main(String[] args) {
        char[] sequence = {'G', 'A', 'T', 'T', 'A', 'C', 'A'};
        char[] revcomp = reverseComplementSequence(sequence);
        for (char x : revcomp) {
            System.out.println(x);
        }
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
        return result;
    }

    public static int countPurines(char[] sequence)
    {
        return countBases(sequence, 'A') + countBases(sequence, 'G');
    }

    public static int countPyrimidines(char[] sequence) {
        return countBases(sequence, 'T') + countBases(sequence, 'C');
    }

    public static char[] complementSequence(char[] sequence) {
        char[] result = new char[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == 'A') {
                result[i] = 'T';
            } else if (sequence[i] == 'T') {
                result[i] = 'A';
            } else if (sequence[i] == 'G') {
                result[i] = 'C';
            } else if (sequence[i] == 'C') {
                result[i] = 'G';
            }
        }
        return result;
    }

    public static char[] reverseSequence(char[] sequence) {
        char[] result = new char[sequence.length];
        for (int i = sequence.length; i >= 1; i--) {
            result[sequence.length - i] = sequence[i - 1];
        }
        return result;
    }

    public static char[] reverseComplementSequence(char[] sequence) {
        return reverseSequence(complementSequence(sequence));
    }
}
