public class MainApp {
    public static void main(String[] args) {
        Equation[] equations = {
            new LinearEquation(2, -4),         // x = 2
            new LinearEquation(0, 5),          // немає розв'язку
            new QuadraticEquation(1, -3, 2),    // x1 = 2, x2 = 1
            new QuadraticEquation(1, 2, 5)      // немає дійсних коренів
        };

        for (Equation eq : equations) {
            System.out.println("Тип: " + eq.getTypeName());
            eq.solve();
            System.out.println("-------------------");
        }
    }
}
