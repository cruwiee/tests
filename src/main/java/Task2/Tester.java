package Task2;

public class Tester {

    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate", 0.0);
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }


    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Experience in years: " + experienceInYears);
        System.out.println("English level: " + englishLevel);
        System.out.println("Salary: " + salary);
    }

    public void increaseSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    public void promote(String newEnglishLevel) {
        englishLevel = newEnglishLevel;
    }

    public void promote(double salaryIncrement) {
        salary += salaryIncrement;
    }

    public void promote(int yearsOfExperience, double salaryIncrement) {
        if (experienceInYears >= yearsOfExperience) {
            salary += salaryIncrement;
        }
    }

    public static void staticMethodExample() {
        System.out.println("Это статический метод класса Tester.");
    }
}
