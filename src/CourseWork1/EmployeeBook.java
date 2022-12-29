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
    }


    public void searchAllDate() {
        for (Employee value : storage) {
            System.out.println(value);

        }
    }

    public int searchAmountOfSalaries() {
        int sum = 0;
        for (Employee value : storage) {
            if (value != null) {
                sum = sum + value.getSalary();
            }

        }
        return sum;
    }

    public Employee searchMinSalary() {
        int min = Integer.MAX_VALUE;
        Employee minSalary = null;
        for (Employee value : storage) {
            if (value != null && value.getSalary() < min) {
                min = value.getSalary();
                minSalary = value;
            }

        }
        return minSalary;
    }

    public Employee searchMaxSalary() {
        int max = Integer.MIN_VALUE;
        Employee maxSalary = null;
        for (Employee value : storage) {
            if (value != null && value.getSalary() > max) {
                max = value.getSalary();
                maxSalary = value;
            }

        }
        return maxSalary;
    }

    public int searchAverageSalary() {
        int counter = 0;
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee] != null) {
                counter++;
            }
        }

        return searchAmountOfSalaries() / counter;
    }

    public void searchFullNameEmployees() {
        for (Employee value : storage) {
            if (value != null) {
                System.out.println("Фио сотрудника - " + value.getFio());
            }
        }
    }

    public void changingIndexSalary(int percent) {
        for (Employee employee : storage) {
            if (employee != null) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
            }
        }
    }

    public Employee searchMinSalaryDepart(String department) {
        Employee minDep = null;
        int min = Integer.MAX_VALUE;
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            String dep = value.getDepartment();
            if (dep.equals(department) && min > value.getSalary()) {
                min = value.getSalary();
                minDep = value;

            }


        }
        return minDep;
    }

    public Employee searchMaxSalaryDepart(String department) {
        Employee maxDep = null;
        int max = Integer.MIN_VALUE;
        String employee = "";
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            String dep = value.getDepartment();
            if (dep.equals(department) && max < value.getSalary()) {
                max = value.getSalary();
                maxDep = value;

            }


        }
        return maxDep;
    }

    public int searchAmountSalaryDepart(String department) {
        int sum = 0;
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                sum = sum + value.getSalary();

            }


        }
        return sum;
    }

    public double searchGeneralSalaryDepart(String department) {
        double sum = 0;
        int employee = 0;
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                sum = sum + value.getSalary();
                employee++;

            }
        }
        if (employee != 0) {
            return sum / employee;
        } else {
            return sum;
        }

    }

    public void changingIndexSalaryDepart(String department, int percent) {
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            String dep = employee.getDepartment();
            if (dep.equals(department)) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * percent));
            }
        }
    }

    public void searchEmployeeDepart(String department) {
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            String dep = value.getDepartment();
            if (dep.equals(department)) {
                System.out.println("ID - " + value.getId() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }

        }


    }

    public void searchEmployeeSalaryBelow(int integer) {
        for (Employee value : storage) {
            if (value == null) {
                continue;
            }
            if (value.getSalary() < integer) {
                System.out.println("ID - " + value.getId() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }

    public void searchEmployeeSalaryMore(int integer) {
        for (Employee value : storage) {
            if (value != null && value.getSalary() >= integer) {
                System.out.println("ID - " + value.getId() + ", ФИО сотрудника - " + value.getFio() + ", " + " зарплата - " + value.getSalary());
            }
        }

    }

    public void addingEmployee(Employee employee) {
        for (int index = 0; index < storage.length; index++) {
            if (storage[index] == null) {
                storage[index] = employee;
                break;
            }

        }
    }

    public void deleteEmployee(String fio, int id) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee] == null) {
                continue;
            }
            if (storage[employee].getFio().equals(fio) || (storage[employee].getId() == id)) {
                storage[employee] = null;
            }
        }
    }

    public void changingDepartEmployee(String fio, String depart) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee] != null && storage[employee].getFio().equals(fio)) {
                storage[employee].setDepartment(depart);

            }
        }
    }

    public void changingSalaryEmployee(String fio, int salary) {
        for (int employee = 0; employee < storage.length; employee++) {
            if (storage[employee] != null && storage[employee].getFio().equals(fio)) {
                storage[employee].setSalary(salary);

            }
        }
    }

    public static void receiveListDepart() {
        String[] departament = new String[storage.length - 1];
        int counterDepart = 0;
        boolean newDepartament = false;
        for (Employee employee : storage) {
            if (employee == null) {
                continue;
            }
            for (String depart : departament) {
                if (employee.getDepartment().equals(depart)) {
                    newDepartament = false;
                    break;
                } else {
                    newDepartament = true;
                }
            }
            if (newDepartament) {
                departament[counterDepart] = employee.getDepartment();
                counterDepart++;
            }

        }
        for (String depart : departament) {
            if (depart == null) {
                continue;
            }
            System.out.println("Отдел " + depart + ". Сотрудники:");
            for (Employee employee : storage) {
                if (employee != null && depart.equals(employee.getDepartment())) {
                    System.out.println(employee.getFio());
                }

            }

        }



    }
}
