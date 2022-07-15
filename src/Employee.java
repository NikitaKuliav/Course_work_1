public class Employee {
    private final String name;
    private final String surname;
    private final String patronymic;
    private int department;
    private int salary;

    private final int id;
    private static int counter;


    public Employee(String name, String surname, String patronymic, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
    }
    private int getCounter() {
        counter++;
        return counter;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }


    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    @Override public String toString() {
        return "ФИО сотрудника: " + this.name + " " + this.surname + " " + this.patronymic +
                " Зарплата сотрудника: " + this.salary +
                " Отдел №" + this.department +
                " ID сотрудника: " + this.id;
    }
}

