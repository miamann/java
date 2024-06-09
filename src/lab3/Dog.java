package lab3;

public class Dog {
    private String name;
    private String breed;
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public static void main(String[] args) {
        Dog dog1 = new Dog("бадди", "золотистый ретривер");
        Dog dog2 = new Dog("чарли", "лабрадор");
        System.out.println("собака 1: имя = " + dog1.getName() + ", порода = " + dog1.getBreed());
        System.out.println("собака 2: имя = " + dog2.getName() + ", порода = " + dog2.getBreed());
        dog1.setName("макс");
        dog1.setBreed("немецкая овчарка");
        dog2.setName("купер");
        dog2.setBreed("бульдог");
        System.out.println("обновленная собака 1: имя = " + dog1.getName() + ", порода = " + dog1.getBreed());
        System.out.println("обновленная собака 2: имя = " + dog2.getName() + ", порода = " + dog2.getBreed());

    }
}

