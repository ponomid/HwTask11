public class Manager extends Worker{

    private int NumberOfSubordinates;

    public Manager(int salary, String name, int numberOfSubordinates) {
        super(salary, name);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    protected int getValue() {
        return 3;
    }

    @Override
    public int getSalary() {
        if (getNumberOfSubordinates() == 0) {
            return super.getSalary();
        } else {
        return (int)(getBaseSalary() * (getNumberOfSubordinates() / 100.0 * getValue()));
    }
}
}
