import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Aleksandr", "Reznik", "Viktorovich", 1, 31250);
        employees[1] = new Employee("Egor", "Erohin", "Dmitrievich", 1, 43500);
        employees[2] = new Employee("Nataliya", "Volkova", "Egorovna", 1, 28350);
        employees[3] = new Employee("Dmitry", "Noskov", "Sergeevich", 2, 25400);
        employees[4] = new Employee("Ekaterina", "Baburina", "Aleksandrovna", 2, 55450);
        employees[5] = new Employee("Sergei", "Shishkin", "Viktorovich", 2, 64350);
        employees[6] = new Employee("Anna", "Shultc", "Evgenievich", 3, 41250);
        employees[7] = new Employee("Jack", "Yudin", "Johnson", 3, 31200);
        employees[8] = new Employee("John", "Lutak", "Jackson", 3, 21850);
        employees[9] = new Employee("Grigoriy", "Kuznecov", "Fedorovich", 3, 81200);
        showAllEmployees(employees);
        System.out.println("Сумма зарплат сотрудников за месяц = " +sumOfSalaries(employees));
        System.out.println("Минимальная зарплата сотрудника = " + empMinSalary(employees));
        System.out.println("Максимальная зарплата сотрудника = " + empMaxSalary(employees));
        System.out.println("Среднее значение зарплат сотрудников за месяц = " + sumOfSalaries(employees) / employees.length);
        showFullName(employees);


    }
    public static void showAllEmployees(Employee[] employees){
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
    public static int sumOfSalaries(Employee[] employees) {
        int sumOfSalaries = 0;
        for (Employee emp: employees) {
            sumOfSalaries += emp.getSalary();
        }
        return sumOfSalaries;
    }

    public static int empMinSalary(Employee[] employees) {
        int minSalary = employees[0].getSalary();
        for (Employee emp: employees) {
            if (emp.getSalary() < minSalary) {
                minSalary = emp.getSalary();
            }
        }
        return minSalary;
    }
    public static int empMaxSalary(Employee[] employees) {
        int maxSalary = employees[0].getSalary();
        for (Employee emp: employees) {
            if (emp.getSalary() > maxSalary) {
                maxSalary = emp.getSalary();
            }
        }
        return maxSalary;
    }
    public static void showFullName(Employee[] employees) {
        for ( Employee emp: employees) {
            System.out.println("Фамилия: " +emp.getSurname() + " " + "Имя: " + emp.getName() + " " + "Отчество: " + emp.getPatronymic());
        }
    }

}