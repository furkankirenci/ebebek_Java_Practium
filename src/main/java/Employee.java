
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int minBonusHours = 40;
    int bonusHourlyFee = 30;
    int currentYear = 2022;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }

    double bonus() {
        if (this.workHours <= minBonusHours) {
            return 0;
        } else {
            return (this.workHours - minBonusHours) * bonusHourlyFee;
        }
    }

    double raiseSalary() {
        if ((currentYear - this.hireYear <= 10) && (currentYear - this.hireYear > 3)) {
            return this.salary * 0.05;
        } else if (currentYear - this.hireYear <= 20) {
            return this.salary * 0.1;
        } else if (currentYear - this.hireYear > 20) {
            return this.salary * 0.15;
        } else {
            return 0;
        }
    }

    public void toStrings() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonus ile Maaş : " + (this.salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (this.salary + bonus() - tax() + raiseSalary()));
    }
}

