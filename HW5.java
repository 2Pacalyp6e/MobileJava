class Employee {
    String familiya, imya, otchestvo, position, email;
    int zp, age;

    Employee(String firstname,
             String name,
             String middlename,
             String position,
             String email,
             int salary,
             int age) {
        this.familiya = firstname;
        this.imya = name;
        this.otchestvo = middlename;
        this.position = position;
        this.email = email;
        this.zp = salary;
        this.age = age;
    }

    void getAllInfo() {
        System.out.println("Фамилия: " + familiya + " | Имя: " + imya
                + " | Отчество: " + otchestvo + " | Должность: " + position
                + " | email: " + email + " | ЗП: " + zp + " | Возраст: "
                + age);
    }

    int getAge() {
        return age;
    }
}

public class HW5 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Tokarev", "Ivan", "Victorovich",
                "Director", "TokarevTT@mail.ru", 1000000, 40);
        employees[1] = new Employee("Maksimov", "Alex", "Alexandrovich", "pomoshnik",
                "MaksimovA@mail.ru", 500000, 30);
        employees[2] = new Employee("Gudvin", "Robin", "Robertovich",
                "Boss", "Goodwin@mail.ru", 3500000, 65);
        employees[3] = new Employee("Pushkarev", "Vladimir", "Vladimirovic",
                "Driver", "PVVi@mail.ru", 65000, 32);
        employees[4] = new Employee("Vasilev", "Artemij", "Balanovich",
                "production", "Productor@mail.ru", 300000, 45);

        for (Employee e : employees) if (e.getAge() >= 40) e.getAllInfo();
    }
}