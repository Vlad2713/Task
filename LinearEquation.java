public class LinearEquation extends Equation {
    private double a, b;

    public LinearEquation(double a, double b) {
        super("Лінійне рівняння");
        this.a = a;
        this.b = b;
    }

    @Override
    public void solve() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Рівняння має безліч розв'язків.");
            } else {
                System.out.println("Рівняння не має розв'язків.");
            }
        } else {
            double x = -b / a;
            System.out.println("Корінь: x = " + x);
        }
    }
}
