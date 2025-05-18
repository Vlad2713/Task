import java.util.Scanner;

public class Lab2task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int rows = 4;
        int cols = 5;

        int[][] matrix = new int[rows][cols];

        // Генерація випадкових чисел від -10 до 60
        System.out.println("Your matrix z =:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 71) - 10;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Обрахунок добутків
        long[] products = new long[cols];
        int totalElements = 0;
        int nonZeroProducts = 0;
        long sum = 0;

        for (int j = 0; j < cols; j++) {
            long product = 1;
            boolean hasValid = false;

            for (int i = 0; i < rows; i++) {
                int val = matrix[i][j];
                if (val >= 10 && val < 55) {
                    product *= val;
                    sum += val;
                    totalElements++;
                    hasValid = true;
                }
            }

            products[j] = hasValid ? product : 0;
            if (hasValid) nonZeroProducts++;
        }

        // Виведення результатів
        System.out.print("\nResult vector: ");
        for (long p : products) {
            System.out.print(p + " ");
        }

        if (totalElements > 0) {
            double avg = (double) sum / totalElements;
            System.out.println("\nP = " + totalElements);
            System.out.println("R = " + avg);
            System.out.println("S = " + sum);
            System.out.println("K = " + nonZeroProducts);
        } else {
            System.out.println("\nПідходящих елементів не знайдено.");
        }
    }
}
