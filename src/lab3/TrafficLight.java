package lab3;

public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public int getDuration() {
        return duration;
    }

    public void changeColor(String newColor, int newDuration) {
        this.color = newColor;
        this.duration = newDuration;
    }

    public boolean isRed() {
        return "красни".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "зелени".equalsIgnoreCase(color);
    }

    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("красный", 30);

        System.out.println("исходный цвет: " + light.getColor());
        System.out.println("исходная продолжительность: " + light.getDuration() + " секунд");
        System.out.println("это красный? " + light.isRed());
        System.out.println("это зеленый? " + light.isGreen());

        light.changeColor("зеленый", 45);

        System.out.println("\nисходный цвет: " + light.getColor());
        System.out.println("исходная продолжительность: " + light.getDuration() + " секунд");
        System.out.println("это красный? " + light.isRed());
        System.out.println("это зеленый? " + light.isGreen());
    }
}

