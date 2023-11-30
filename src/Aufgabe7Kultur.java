public class Aufgabe7Kultur {
    public static void main(String[] args) {
        char[] stati = new char[]{'s', 's', 's', 'u', 'u', 'u', 's', 's', 'u', 'u', 'u', 'u', 's', 's', 'u', 's', 's', 's',
                's', 'u', 'u', 's', 's', 's', 's', 'u', 's', 's', 'u', 'u', 's', 'u', 'u', 's', 's', 'u', 'u', 's', 's', 'u'};
        double[] prices = new double[]{600, 6000, 1500, 1000, 1000, 1500, 2500, 1800, 1500, 400, 4000, 2000, 5000, 1000,
                2000, 6000, 800, 1000, 1500, 1000, 1500, 500, 1500, 1500, 1500, 8000, 3000, 8000, 2500, 5000, 1500, 5000, 10000,
                2000, 1500, 3500, 1500, 2500, 2500, 2500};
        System.out.println(showMetrics(createArtObjects(stati, prices))[0]);
        System.out.println(showMetrics(createArtObjects(stati, prices))[1]);

    }

    public static double[] priceMetrics(ArtObject[] objects) {
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
            sum += x.Price;
        }
        avg = sum / objects.length;
        return new double[]{smallest, biggest, avg};
    }

    public static ArtObject[] filterByStatus(ArtObject[] objects, char status) {
        int count = 0;
        for (ArtObject x : objects) {
            if (x.Status == status) {
                count++;
            }
        }
        ArtObject[] result = new ArtObject[count];
        count = 0;
        for (ArtObject x : objects) {
            if (x.Status == status) {
                result[count] = x;
                count++;
            }
        }
        return result;
    }

    public static ArtObject[] createArtObjects(char[] stati, double[] prices) {
        ArtObject[] result = new ArtObject[stati.length];
        for (int i = 0; i < stati.length; i++) {
            result[i] = new ArtObject(stati[i], prices[i]);
        }
        return result;
    }

    public static String[] showMetrics(ArtObject[] object) {
        String[] result = new String[2];
        result[0] = "Verkauft - " +
                "Min: " + priceMetrics(filterByStatus(object, 's'))[0] +
                ", Max: " + priceMetrics(filterByStatus(object, 's'))[1] +
                ", Mean: " + priceMetrics(filterByStatus(object, 's'))[2];
        result[1] = "Nicht verkauft - " +
                "Min: " + priceMetrics(filterByStatus(object, 'u'))[0] +
                ", Max: " + priceMetrics(filterByStatus(object, 'u'))[1] +
                ", Mean: " + priceMetrics(filterByStatus(object, 'u'))[2];
        return result;
    }
}
