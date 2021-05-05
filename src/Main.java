public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(100, "Ilia", 10);
        Director director = new Director(100, "Ilia", 10);

        System.out.println(manager.getSalary());
        System.out.println(director.getSalary());

    }
}
