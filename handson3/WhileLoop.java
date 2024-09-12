package handson3;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 1;

        while (counter <= 20) {
            if (counter % 3 == 0){
                counter++;
                continue;
            }
            if (counter > 15){
                break;
            }
            System.out.println("Angka: " + counter);
            counter++;
        }
    }
}