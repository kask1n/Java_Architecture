package HW3_Architect.SRP;

public class EmployeeSalaryCalculate {
    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int salaryCalculate() {
        return (int) (baseSalary * 1.25);
    }
}
