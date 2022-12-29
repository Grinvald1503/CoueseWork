package CourseWork1;

public class Employee {
    private String fio;
    private int salary;
    private String department;
    private static int counter = 1;

    private final int id;

    public Employee(String fio, int salary, String department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.id = counter;
        counter++;

    }

    public String getFio() {
        return fio;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника - " + fio + ", Зарплата = " + salary + ", " + "отдел - " + department + ", ID сотрудника - " + id;
    }
}
