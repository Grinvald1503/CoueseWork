package CourseWork1;

public class Employee {
    private String fio;
    private int salary;
    private String department;
    private static int id = 1;

    private final int idEmployee;

    public Employee(String fio, int salary, String department) {
        this.fio = fio;
        this.salary = salary;
        this.department = department;
        this.idEmployee = id;
        id++;

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

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника - " + fio + ", Зарплата = " + salary + ", " + "отдел - " + department + ", ID сотрудника - " + idEmployee;
    }
}
