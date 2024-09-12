package handson3;

public class latianforeach {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        for (int num : numbers) {
            if (num % 3 == 0) {
                continue;
            }
            if (num > 15) {
                break;
            }
            System.out.println(num);
        }
    }
}
