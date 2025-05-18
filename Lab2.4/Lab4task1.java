import java.util.Scanner; 
public class Lab4task1 {
    public double calculateAbsoluteDeviation(double[] array) {
        // Крок 1: Обчислити середнє значення
        double sum = 0;
        for (double value : array) {
            sum += value;
        }
        double average = sum / array.length;

        // Крок 2: Обчислити суму абсолютних відхилень від середнього
        double totalDeviation = 0;
        for (double value : array) {
            totalDeviation += Math.abs(value - average);
        }

        return totalDeviation;
    }

    public static void main(String[] args) {
        Lab4task1 lab = new Lab4task1();
        double[] A = {5, -3, 8, 2, 7, -1, 4, 6, -2, 0, 9, 1};
        double result = lab.calculateAbsoluteDeviation(A);
        System.out.println("Сума абсолютних відхилень: " + result);
    }
}

