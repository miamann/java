package lab1;

public class task4 {
    public static void main(String[] args) {
        int minutes = 60;
        int messages = 55;
        double baseCost = 15.00;
        double additionalMinutesCost = Math.max(0, minutes - 50) * 0.25;
        double additionalMessagesCost = Math.max(0, messages - 50) * 0.15;
        double supportCost = 0.44;
        double subtotal = baseCost + additionalMinutesCost + additionalMessagesCost + supportCost;
        double tax = subtotal * 0.05;
        double totalCost = subtotal + tax;
        System.out.printf("базовая стоимость: $%.2f%n", baseCost);
        if (additionalMinutesCost > 0) {
            System.out.printf("дополнительные минуты: $%.2f%n", additionalMinutesCost);
        }
        if (additionalMessagesCost > 0) {
            System.out.printf("дополнительные сообщения: $%.2f%n", additionalMessagesCost);
        }
        System.out.printf("сбор за 911: $%.2f%n", supportCost);
        System.out.printf("налог: $%.2f%n", tax);
        System.out.printf("итоговая сумма: $%.2f%n", totalCost);
    }
}
