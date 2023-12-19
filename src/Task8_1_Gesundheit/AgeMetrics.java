package Task8_1_Gesundheit;

import java.util.ArrayList;

public class AgeMetrics {
    ArrayList<Double> ages = new ArrayList<>();
    public AgeMetrics(){

    }
    public void addAge(double age){
        ages.add(age);
    }

    public double getMinAge(){
       if (!this.isEmpty()){
           return ages.stream().min(Double::compare).get();
       }
       return 0.0;
    }

    public double getMaxAge(){
        if (!this.isEmpty()){
            return ages.stream().max(Double::compare).get();
        }
        return 0.0;
    }

    public double getAverageAge(){
        return ages.stream().mapToDouble(a -> a).sum() / ages.size();
    }

    public boolean isEmpty(){
        return ages.isEmpty();
    }
}
