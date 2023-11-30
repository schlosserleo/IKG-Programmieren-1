public class Aufgabe7Kultur {
    public static void main(String[] args){

    }
    public static double[] priceMetrics(ArtObject[] objects){
        double smallest, biggest;
        smallest = biggest = objects[0].Price;
        double avg, sum;
        sum = 0;
        for (ArtObject x : objects) {
            if (x.Price <= smallest) {
                smallest = x.Price;
            } else if (x.Price >= biggest) {
                biggest = x.Price;
            }
            sum += x;
        }
        avg = sum / objects.length;
        return new double[]{smallest, biggest, avg};
    }
}
