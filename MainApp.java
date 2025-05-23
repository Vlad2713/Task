import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Іваненко", "Ігор", "Сергійович", LocalDate.of(1985, 6, 15)),
                new Employee("Сидоренко", "Олена", "Миколаївна", LocalDate.of(1990, 3, 20),
                        "Бухгалтер", LocalDate.of(2015, 4, 1))
        };

        for (Person person : people) {
            person.printInfo();
            if (person instanceof Employee) {
                ((Employee) person).printWorkExperience();
            } else {
                person.printAge();
            }
            System.out.println("--------------------");
        }
    }
}

