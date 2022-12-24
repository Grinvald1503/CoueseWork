package CourseWork1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    private static Employee[] storage = new Employee[10];


    public static void main(String[] args) {
        storage[0] = new Employee("Александров Александ Александрович", 50000, "1");
        storage[1] = new Employee("Алексеев Алексей Алексеевич", 55000, "1");
        storage[2] = new Employee("Евгениев Евгений Евгениевич", 53000, "2");
        storage[3] = new Employee("Генадьев Генадий Генадиевич", 46000, "2");
        storage[4] = new Employee("Григорьев Григорий Григорьевич", 60000, "3");
        storage[5] = new Employee("Викторьева Виктория Викторовна", 58000, "3");
        storage[6] = new Employee("Дмитриев Дмитрий Дмитриевич", 64000, "4");
        storage[7] = new Employee("Дмитриева Ирина Александровна", 100000, "4");
        storage[8] = new Employee("Кирилов Кирил Викторович", 34000, "5");
        storage[9] = new Employee("Виладимиров Владимир Владимирович", 70000, "5");


        searchEmployeeSalaryMore(50000);
    }


    public static void searchAllDate() {
        for (Employee value : storage) {
            System.out.println(value);

        }
    }

    public static int searchAmountOfSalaries() {
        int sum = 0;
        for (Employee value : storage) {
            sum = sum + value.getSalary();

        }
        return sum;
    }

    public static int searchMinSalary() {
        int min = Integer.MAX_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() < min) {
                min = value.getSalary();
            }

        }
        return min;
    }

    public static int searchMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() > max) {
                max = value.getSalary();
            }

        }
        return max;
    }

    public static int SearchAverageSalary() {
        return searchAmountOfSalaries() / storage.length;
    }

    public static void searchFullNameEmployees() {
        for (Employee value : storage) {
            System.out.println("Фио сотрудника - " + value.getFio());
        }
    }

    public static void changingIndexSalary(int percent) {
        for (Employee employee : storage) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
        }
    }

    public static String searchMinSalaryDepart(String department) {
        int min = Integer.MAX_VALUE;
        String employee = "";
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department) && min > value.getSalary()) {
                min = value.getSalary();
                employee = value.getFio();

            }


        }
        return employee;
    }

    public static String searchMaxSalaryDepart(String department) {
        int max = Integer.MIN_VALUE;
        String employee = "";
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department) && max < value.getSalary()) {
                max = value.getSalary();
                employee = value.getFio();

            }


        }
        return employee;
    }

    public static int searchAverageSalaryDepart(String department) {
        int sum = 0;
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                sum = sum + value.getSalary();

            }


        }
        return sum;
    }

    public static int searchGeneralSalaryDepart(String department) {
        int sum = 0;
        int employee = 0;
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                sum = sum + value.getSalary();
                employee++;

            }


        }
        return sum / employee;
    }

    public static void changingIndexSalaryDepart(String department, int percent) {
        for (Employee employee : storage) {
            String dep = employee.getDepartment();
            if (dep.equals(department))
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
        }
    }

    public static void searchEmployeeDepart(String department) {
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }

        }


    }

    public static void searchEmployeeSalaryBelow(int integer) {
        for (Employee value : storage) {
            if (value.getSalary() < integer) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }
    public static void searchEmployeeSalaryMore(int integer) {
        for (Employee value : storage) {
            if (value.getSalary() >= integer) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }
}

