public class Employee {
    private int baseSalary;
    private String name;

    public Employee(int salary, String name) {
        this.baseSalary = salary;
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return this.baseSalary;
    }


}
