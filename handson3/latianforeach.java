package handson3;

public class latianforeach {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int num : numbers) {
            if (num % 3 == 0) {
                continue;  // Lewati angka yang habis dibagi 3
            }
            if (num > 15) {
                break;  // Berhenti setelah mencapai angka 15
            }
            System.out.println(num);
        }
    }
}
