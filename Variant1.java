public class Variant1 {
    public static void main(String[] args) {
        double a = 0.5;
        double b = 1.0;
        double T = 2.0;
        double h = 0.2;

        double maxY = Double.NEGATIVE_INFINITY;
        double argMaxX = 0.0;

        for (double x = 0.0; x <= T; x += h) {
            double z = Math.pow(x, 5) + a * x + Math.pow(b, 3);
            double y = Math.pow(Math.cos(z + a), 2) - x;

            if (y > maxY) {
                maxY = y;
                argMaxX = x;
            }

            System.out.printf("x = %.1f, y = %.5f%n", x, y);
        }

        System.out.printf("\nМаксимальне y = %.5f при x = %.1f%n", maxY, argMaxX);
    }
}

