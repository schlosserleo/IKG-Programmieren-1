package Task8_1_Gesundheit;

import java.util.ArrayList;

public class PatientList {
    public PatientList(){

        }
    ArrayList<Patient> patients = new ArrayList<>();

    public void addPatient(Patient p) {
        this.patients.add(p);

    }
    public int getNumPatients(){
        return this.patients.size();
    }

    public AgeMetrics getAgeMetrics(){
        AgeMetrics metrics = new AgeMetrics();
        for (Patient x : this.patients){
            metrics.addAge(x.getAge());
        }
        return metrics;
    }

    public PatientList filterByStatus(char status){
        PatientList result = new PatientList();
        for (int i = 0; i < this.patients.size(); i++){
            Patient currentPatient = this.patients.get(i);
            if (currentPatient.getStatus() == status)
                result.addPatient(currentPatient);
            }
        return result;
        }

    public String toString(){
        return "Min: " + this.getAgeMetrics().getMinAge() +
                ", Max: " + this.getAgeMetrics().getMaxAge() +
                ", Mean: " + String.format("%.13f", this.getAgeMetrics().getAverageAge());
    }
}

