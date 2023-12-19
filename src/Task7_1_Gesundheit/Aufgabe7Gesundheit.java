package Task7_1_Gesundheit;

public class Aufgabe7Gesundheit {
    public static void main(String[] args){
        double[] ages = {20, 45, 69, 70, 45, 16, 59, 45, 24, 54, 53, 65, 61, 3, 48, 47, 13, 85, 27, 69, 45, 20, 67, 63,
                18, 56, 25, 35, 35, 24, 70, 65, 34, 32, 23, 67, 53, 35, 33, 38, 22, 27, 69, 64, 36, 27, 51, 48, 46, 85,
                38, 41, 24, 22, 73, 69, 23, 41, 32, 40, 65, 56, 47, 65, 70, 23, 65, 37, 63, 59, 26, 63, 69, 23, 24, 33,
                35, 70, 36, 53, 35, 1, 60, 22, 18, 21, 21, 23, 70, 32, 38, 18, 74, 21, 20, 44, 38, 21, 42, 68, 29, 58,
                1, 51, 45, 32, 34, 24, 48, 35, 26, 73, 75, 67, 67, 65, 44, 62, 75, 60, 1, 80, 72, 71, 65, 66, 55, 22,
                50, 80, 50, 45};

        char[] stati = {'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r',
                'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'd',
                'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r',
                'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r',
                'd', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'r',
                'r', 'd', 'r', 'r', 'r', 'd', 'r', 'r', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd',
                'd', 'd', 'd', 'd', 'd', 'd', 'd', 'd'};

        Patient[] patients = createPatients(stati, ages);
        System.out.println(showMetrics(patients)[0]);
        System.out.println(showMetrics(patients)[1]);
    }

    public static double[] ageMetrics(Patient[] patients){
        double smallest, biggest;
        smallest = biggest = patients[0].age;
        double avg, sum;
        sum = 0;
        for (Patient x : patients) {
            if (x.age <= smallest) {
                smallest = x.age;
            } else if (x.age >= biggest) {
                biggest = x.age;
            }
            sum += x.age;
        }
        avg = sum / patients.length;
        return new double[]{smallest, biggest, avg};
    }

    public static Patient[] filterByStatus(Patient[] patients, char status){
        int count = 0;
        for (Patient x : patients) {
            if (x.status == status) {
                count++;
            }
        }

        Patient[] result = new Patient[count];
        count = 0;
        for (Patient x : patients) {
            if (x.status == status) {
                result[count] = x;
                count++;
            }
        }
        return result;
    }

    public static Patient[] createPatients(char[] stati, double[] ages){
        Patient[] result = new Patient[stati.length];
        for (int i = 0; i < result.length; i++){
            result[i] = new Patient(stati[i], ages[i]);
        }
        return result;
    }

    public static String[] showMetrics(Patient[] patients){
        String[] result = new String[2];

        Patient[] recoveredPatients = filterByStatus(patients, 'r');
        Patient[] deceasedPatients = filterByStatus(patients, 'd');

        double[] recoveredMetrics = ageMetrics(recoveredPatients);
        double[] deceasedMetrics = ageMetrics(deceasedPatients);

        result[0] = "Verstorben - Min: " + deceasedMetrics[0] + ", Max: " + deceasedMetrics[1] + ", Mean: " + deceasedMetrics[2];
        result[1] = "Genesen - Min: " + recoveredMetrics[0] + ", Max: " + recoveredMetrics[1] + ", Mean: " + recoveredMetrics[2];

        return result;
    }
}
