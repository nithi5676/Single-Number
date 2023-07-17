package singlenumber;

import java.util.Scanner;

public class SingleNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array Size: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter array Elements");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Single(array, size));
    }

    public static int Single(int array[], int size) {
        if (size % 2 == 0) {
            throw new IllegalArgumentException("Array should have odd number of elements.");
        } else {
            int result = 0;
            for (int j = 0; j < size; j++) {
                result = result ^ array[j];
            }
            return result;
        }
    }

}
