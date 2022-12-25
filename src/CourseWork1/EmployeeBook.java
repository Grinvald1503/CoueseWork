package CourseWork1;

public class EmployeeBook {
    private static Employee[] storage = new Employee[10];


    public void fillingArray() {
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


        receiveListDepart();
    }


    public void searchAllDate() {
        for (Employee value : storage) {
            System.out.println(value);

        }
    }

    public int searchAmountOfSalaries() {
        int sum = 0;
        for (Employee value : storage) {
            sum = sum + value.getSalary();

        }
        return sum;
    }

    public int searchMinSalary() {
        int min = Integer.MAX_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() < min) {
                min = value.getSalary();
            }

        }
        return min;
    }

    public int searchMaxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() > max) {
                max = value.getSalary();
            }

        }
        return max;
    }

    public int SearchAverageSalary() {
        return searchAmountOfSalaries() / storage.length;
    }

    public void searchFullNameEmployees() {
        for (Employee value : storage) {
            System.out.println("Фио сотрудника - " + value.getFio());
        }
    }

    public void changingIndexSalary(int percent) {
        for (Employee employee : storage) {
            employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
        }
    }

    public String searchMinSalaryDepart(String department) {
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

    public String searchMaxSalaryDepart(String department) {
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

    public int searchAverageSalaryDepart(String department) {
        int sum = 0;
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                sum = sum + value.getSalary();

            }


        }
        return sum;
    }

    public int searchGeneralSalaryDepart(String department) {
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

    public void changingIndexSalaryDepart(String department, int percent) {
        for (Employee employee : storage) {
            String dep = employee.getDepartment();
            if (dep.equals(department))
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
        }
    }

    public void searchEmployeeDepart(String department) {
        for (Employee value : storage) {
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }

        }


    }

    public void searchEmployeeSalaryBelow(int integer) {
        for (Employee value : storage) {
            if (value.getSalary() < integer) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }

    public void searchEmployeeSalaryMore(int integer) {
        for (Employee value : storage) {
            if (value.getSalary() >= integer) {
                System.out.println("ID - " + value.getIdEmployee() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }

    public void addingEmployee(String fio, int salary, String depart) {
        Employee employee = new Employee(fio, salary, depart);
        for (int index = 0; index < storage.length; index++) {
            if (storage[index] == null) {
                storage[index] = employee;
            }

        }
    }

    public void deleteEmployee(String fio, int id) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee].getFio().equals(fio) || (storage[employee].getIdEmployee() == id)) {
                storage[employee] = null;
            }
        }
    }

    public void changingDepartEmployee(String fio, String depart) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee].getFio().equals(fio)) {
                storage[employee].setDepartment(depart);

            }
        }
    }

    public void changingSalaryEmployee(String fio, int salary) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee].getFio().equals(fio)) {
                storage[employee].setSalary(salary);

            }
        }
    }

    public void receiveListDepart() {
        String depart = "1";
        System.out.println("Отдел - " + depart);
        for (Employee value : storage) {
            if (value.getDepartment().equals(depart)) {
                System.out.println(value.getFio());
            }
        }


        depart = "2";
        System.out.println("Отдел - " + depart);
        for (Employee value : storage) {
            if (value.getDepartment().equals(depart)) {
                System.out.println(value.getFio());
            }
        }
        depart = "3";
        System.out.println("Отдел - " + depart);
        for (Employee value : storage) {
            if (value.getDepartment().equals(depart)) {
                System.out.println(value.getFio());
            }
        }
        depart = "4";
        System.out.println("Отдел - " + depart);
        for (Employee value : storage) {
            if (value.getDepartment().equals(depart)) {
                System.out.println(value.getFio());
            }
        }
        depart = "5";
        System.out.println("Отдел - " + depart);
        for (Employee value : storage) {
            if (value.getDepartment().equals(depart)) {
                System.out.println(value.getFio());
            }
        }
    }
}
