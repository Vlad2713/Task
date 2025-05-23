public abstract class Equation {
    protected String typeName;

    public Equation(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    // Абстрактний метод обчислення коренів
    public abstract void solve();
}