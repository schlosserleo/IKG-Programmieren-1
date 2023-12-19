package Extra_Task_1;

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'A', 'T', 'G', 'C'};
        Sequence seq = new Sequence(a);
        System.out.println("Length: " + seq.reverseComplement());
    }
}