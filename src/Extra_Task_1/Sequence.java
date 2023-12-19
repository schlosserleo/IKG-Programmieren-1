package Extra_Task_1;
public class Sequence {
    public char[] sequence;
    public Sequence(char[] seq){
        this.sequence = seq;
    }
    public int getLength(){
        return this.sequence.length;
    }
    public int getNumPyrimidines(){
        int count = 0;
        for (char x : this.sequence){
            if (x == 'T' || x == 'C') count++;
        }
        return count;
    }
    public int getNumPurines(){
        int count = 0;
        for (char x : this.sequence){
            if (x == 'G' || x == 'A') count++;
        }
        return count;
    }
    public Sequence reverseComplement(){

        char[] compresult = new char[this.sequence.length];
        for (int i = 0; i < this.sequence.length; i++) {
            if (this.sequence[i] == 'A') {
                compresult[i] = 'T';
            } else if (this.sequence[i] == 'T') {
                compresult[i] = 'A';
            } else if (this.sequence[i] == 'G') {
                compresult[i] = 'C';
            } else if (this.sequence[i] == 'C') {
                compresult[i] = 'G';
            }
        }
        char[] result = new char[compresult.length];
        for (int i = compresult.length; i >= 1; i--) {
            result[compresult.length - i] = compresult[i - 1];
        }
        return new Sequence(result);
    }
}
