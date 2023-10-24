public class Task3_5 {
    public static void main(String[] args){
        for (int i = 0; i <= 80; i++){
            if ((i % 9) == 0 && i != 0){
                System.out.println();
            } if ((i % 2) != 0) {
                System.out.print(".");
            } else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
