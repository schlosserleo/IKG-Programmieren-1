package Task8_1_Gesundheit;

public class Patient {
    private final char status;
    private final double age;

    Patient(char status, double age){
        this.status = status;
        this.age = age;
    }

    public double getAge(){
        return age;
    }

    public char getStatus(){
        return status;
    }
}
