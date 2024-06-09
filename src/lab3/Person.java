package lab3;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Person person1 = new Person("алиса", 30);
        Person person2 = new Person("боб", 25);
        System.out.println("персонал 1: имя = " + person1.getName() + ", возраст = " + person1.getAge());
        System.out.println("персонал 2: имя = " + person2.getName() + ", возраст = " + person2.getAge());
    }
}
