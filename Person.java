import java.time.LocalDate;
import java.time.Period;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected LocalDate birthDate;

    public Person() {
        this("Іванов", "Іван", "Іванович", LocalDate.of(2000, 1, 1));
    }

    public Person(String lastName, String firstName, String middleName, LocalDate birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
    }

    public void printInfo() {
        System.out.println("Прізвище та ініціали: " + lastName + " " +
                firstName.charAt(0) + "." + middleName.charAt(0) + ".");
    }

    public void printAge() {
        Period age = Period.between(birthDate, LocalDate.now());
        System.out.println("Вік: " + age.getYears() + " років, " +
                age.getMonths() + " місяців, " + age.getDays() + " днів");
    }
}
