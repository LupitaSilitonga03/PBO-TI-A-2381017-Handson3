package handson1;

public class ForLoop {
    public static void main(String[] args) {
        String[] kumpulanBuah = new String[]{"Apel", "Pisang", "Mangga", "Jeruk"};
        for (int i = 0; i < 4; i++){
            if (i == 2) {
                break;
            }
            System.out.println("Elemen ke " + ( i +1)  + ": " + kumpulanBuah[i]);
        }
    }
}
