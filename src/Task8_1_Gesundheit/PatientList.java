package Task8_1_Gesundheit;

import java.util.ArrayList;

public class PatientList {
    public PatientList(){

        }
    ArrayList<Patient> patients = new ArrayList<>();
    AgeMetrics metrics = new AgeMetrics();
    void addPatient(Patient p) {
        patients.add(p);
        metrics.addAge(p.getAge());
    }
    int getNumPatients(){
        return patients.size();
    }

    public AgeMetrics getAgeMetrics(){
        return metrics;
    }

    public PatientList filterByStatus(char status){

    }
}
