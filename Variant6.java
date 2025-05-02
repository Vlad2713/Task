public class Variant6 {
    public static void main(String[] args) {
        double beta = 0.3;
        double phi = 1.5;
        double omega = 0.4;
        double hAlpha = 0.1;

        System.out.println("alpha\ty");

        for (double alpha = 0.0; alpha <= 1.0; alpha += hAlpha) {
            double y = 2 * Math.sin(alpha - beta) + Math.cos(phi - omega);
            System.out.printf("%.1f\t%.4f%n", alpha, y);
        }
    }
}

