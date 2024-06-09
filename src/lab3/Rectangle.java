package lab3;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 7.0);
        System.out.println("ширина: " + rectangle.getWidth());
        System.out.println("высота: " + rectangle.getHeight());
        System.out.println("площадь: " + rectangle.calculateArea());
        System.out.println("периметр: " + rectangle.calculatePerimeter());
        rectangle.setWidth(10.0);
        rectangle.setHeight(20.0);
        System.out.println("обновленная ширина: " + rectangle.getWidth());
        System.out.println("обновленная высота: " + rectangle.getHeight());
        System.out.println("обновленная площадь: " + rectangle.calculateArea());
        System.out.println("обновленный периметр: " + rectangle.calculatePerimeter());

    }
}

