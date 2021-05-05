import java.util.Objects;

public class Utils {

    public static Employee findByName(String name, Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (Objects.equals(name, employees[i].getName())) {
                return employees[i];
            }
        }
        return null;
    }


}
