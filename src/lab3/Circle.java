public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("радиус не может быть отрицательным");
        }
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("радиус: " + circle.getRadius());
        System.out.println("площадь: " + circle.calculateArea());
        System.out.println("длина окружности: " + circle.calculateCircumference());
        circle.setRadius(10.0);
        System.out.println("обновленный радиус: " + circle.getRadius());
        System.out.println("обновленная площадь: " + circle.calculateArea());
        System.out.println("обновленная длина окружности: " + circle.calculateCircumference());
    }
}
