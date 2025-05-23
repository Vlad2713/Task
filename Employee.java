import java.time.LocalDate;
import java.time.Period;

public class Employee extends Person {
    private String position;
    private LocalDate startDate;

    public Employee() {
        this("Петров", "Петро", "Петрович", LocalDate.of(1990, 1, 1), "Менеджер", LocalDate.of(2020, 1, 1));
    }

    public Employee(String lastName, String firstName, String middleName, LocalDate birthDate,
                    String position, LocalDate startDate) {
        super(lastName, firstName, middleName, birthDate);
        this.position = position;
        this.startDate = startDate;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Посада: " + position);
    }

    public void printWorkExperience() {
        Period workPeriod = Period.between(startDate, LocalDate.now());
        System.out.println("Стаж: " + workPeriod.getYears() + " років, " +
                workPeriod.getMonths() + " місяців, " + workPeriod.getDays() + " днів");
    }
}
