public class Employee {
    private String name;
    private String position;
    private double salary;
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public double getSalary() {
        return salary;
    }
    public void updateSalary(double newSalary) {
        if (newSalary >= 0) {
            this.salary = newSalary;
        } else {
            throw new IllegalArgumentException("зарплата не может быть отрицательной");
        }
    }
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    @Override
    public String toString() {
        return "сотрудник [имя=" + name + ", должность=" + position + ", зарплатв=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("алиса", "менеджер", 5000.0);
        Employee employee2 = new Employee("боб", "разработчик", 4000.0);
        System.out.println(employee1);
        System.out.println("годовая зарплата " + employee1.getName() + ": " + employee1.calculateAnnualSalary());
        System.out.println(employee2);
        System.out.println("годовая зарплата " + employee2.getName() + ": " + employee2.calculateAnnualSalary());
        employee1.updateSalary(5500.0);
        employee2.updateSalary(4500.0);
        System.out.println("обновленный " + employee1);
        System.out.println("обновленная годовая зарплата " + employee1.getName() + ": " + employee1.calculateAnnualSalary());
        System.out.println("обновленный " + employee2);
        System.out.println("обновленная годовая зарплата " + employee2.getName() + ": " + employee2.calculateAnnualSalary());
    }
}
