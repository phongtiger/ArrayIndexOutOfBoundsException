import java.util.Random;
import java.util.Scanner;

public class CreateArr {
    public static void main(String[] args) {
        int[] arr = createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index: ");
        int index = scanner.nextInt();
        try {
            System.out.println(" Value of index "+ index+" is " +arr[index]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(" Error index ");
        }
    }
    private static int[] createRandom() {
        Random rd = new Random(100);
        System.out.println(rd.nextInt());
        int[] arr1 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr1[i] = rd.nextInt(100);
        }
        return arr1;
    }
}
