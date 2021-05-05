public class Director extends Manager{


    public Director(int salary, String name, int numberOfSubordinates) {
        super(salary, name, numberOfSubordinates);
    }

    @Override
    protected int getValue() {
        return 9;
    }
}
