public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    double totalSalary;
    double totalSalaryWithRaise;

    public Employee(String name, int salary, int workHours, int hireYear) {

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.totalSalary = this.salary + this.bonus(this.workHours) - tax(this.salary);
        this.totalSalaryWithRaise = this.totalSalary + this.raiseSalary(this.hireYear, this.salary);

    }

    public double tax(int salary) {
        return salary > 1000 ? salary * 0.03 : salary;
    }

    public int bonus(int workHours) {
        return workHours > 40 ? (workHours - 40) * 30 : 0;
    }

    public double raiseSalary(int hireYear, int salary) {
        int workingYear = 2021 - hireYear;
        double raisePercentage = workingYear < 10 ? 0.05 : (workingYear < 20 ? 0.1 : 0.15);
        return salary * raisePercentage;
    }
}
