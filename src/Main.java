import java.util.Arrays;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Aleksandr", "Reznik", "Viktorovich", 1, 31250);
        employees[1] = new Employee("Egor", "Erohin", "Dmitrievich", 1, 43500);
        employees[2] = new Employee("Nataliya", "Volkova", "Egorovna", 1, 28352);
        employees[3] = new Employee("Dmitry", "Noskov", "Sergeevich", 2, 25403);
        employees[4] = new Employee("Ekaterina", "Baburina", "Aleksandrovna", 2, 55450);
        employees[5] = new Employee("Sergei", "Shishkin", "Viktorovich", 2, 64350);
        employees[6] = new Employee("Anna", "Shultc", "Evgenievich", 3, 41250);
        employees[7] = new Employee("Jack", "Yudin", "Johnson", 3, 31200);
        employees[8] = new Employee("John", "Lutak", "Jackson", 3, 21850);
        employees[9] = new Employee("Grigoriy", "Kuznecov", "Fedorovich", 3, 81200);
        showAllEmployees();
        System.out.println("Сумма зарплат сотрудников за месяц = " +sumOfSalaries());
        System.out.println("Минимальная зарплата сотрудника = " + empMinSalary());
        System.out.println("Максимальная зарплата сотрудника = " + empMaxSalary());
        System.out.println("Среднее значение зарплат сотрудников за месяц = " + empAvrSalary() );
        showFullName();


    }
    private static void showAllEmployees(){
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    private static int sumOfSalaries() {
        int sumOfSalaries = 0;
        for (Employee emp: employees) {
            sumOfSalaries += emp.getSalary();
        }
        return sumOfSalaries;
    }

    private static int empMinSalary() {
        int minSalary = employees[0].getSalary();
        for (Employee emp: employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
            }
        }
        return minSalary;
    }
    private static int empMaxSalary() {
        int maxSalary = employees[0].getSalary();
        for (Employee emp: employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }
    private static double empAvrSalary() {
        return (double)sumOfSalaries() / employees.length;
    }
    private static void showFullName() {
        for ( Employee emp: employees) {
            System.out.println("Фамилия: " +emp.getSurname() + " " + "Имя: " + emp.getName() + " " + "Отчество: " + emp.getPatronymic());
        }
    }

}