package CourseWork1;

public class Main {
private static Employee[] storage = new Employee[10];


    public static void main(String[] args) {
        Employee alex = new Employee("Александров Александ Александрович", 50000, "1");
        Employee alexei = new Employee("Алексеев Алексей Алексеевич", 55000, "1");
        Employee evgen = new Employee("Евгениев Евгений Евгениевич", 53000, "2");
        Employee gena = new Employee("Генадьев Генадий Генадиевич", 46000, "2");
        Employee gricha = new Employee("Григорьев Григорий Григорьевич", 60000, "3");
        Employee vikrolia = new Employee("Викторьева Виктория Викторовна", 58000, "3");
        Employee dmitri = new Employee("Дмитриев Дмитрий Дмитриевич", 64000, "4");
        Employee irina = new Employee("Дмитриева Ирина Александровна", 100000, "4");
        Employee kiril = new Employee("Кирилов Кирил Викторович", 34000, "5");
        Employee vova = new Employee("Виладимиров Владимир Владимирович", 70000, "5");
        storage[0] = alex;
        storage[1] = alexei;
        storage[2] = evgen;
        storage[3] = gena;
        storage[4] = gricha;
        storage[5] = vikrolia;
        storage[6] = dmitri;
        storage[7] = irina;
        storage[8] = kiril;
        storage[9] = vova;


  //       allDate();
  //      System.out.println(amountOfSalaries());
  //      System.out.println(minSalary());
  //      System.out.println(maxSalary());
  //      System.out.println(averageSalary());
  //      fullNameEmployees();


    }
    public static void allDate () {
        for (Employee value : storage) {
            System.out.println(value);

        }
    }
    public static int amountOfSalaries () {
        int sum = 0;
        for (Employee value : storage) {
            sum = sum + value.getSalary();

        }
        return sum;
    }
    public static int minSalary() {
        int min = Integer.MAX_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() < min) {
                min = value.getSalary();
            }

        }
        return min;
    }
    public static int maxSalary() {
        int max = Integer.MIN_VALUE;
        for (Employee value : storage) {
            if (value.getSalary() > max) {
                max = value.getSalary();
            }

        }
        return max;
    }
    public static int averageSalary() {
        int sum = amountOfSalaries();
        return amountOfSalaries() / storage.length;
    }
    public static void fullNameEmployees () {
        for (Employee value : storage) {
            System.out.println("Фио сотрудника - " + value.getFio());
        }
    }

}