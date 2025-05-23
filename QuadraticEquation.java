public class QuadraticEquation extends Equation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        super("Квадратне рівняння");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void solve() {
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("Це не квадратне рівняння.");
        } else if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корені: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Один корінь: x = " + x);
        } else {
            System.out.println("Рівняння не має дійсних коренів.");
        }
    }
}

