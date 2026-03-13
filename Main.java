import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.println("=== Motor Parts Shop Management System ===");

            System.out.print("Enter part type (1 = Engine Part, 2 = Brake Part): ");
            int type = input.nextInt();
            input.nextLine();

            System.out.print("Enter part name: ");
            String name = input.nextLine();

            System.out.print("Enter part price: ");
            double price = input.nextDouble();

            Product part;

            if (type == 1) {
                part = new EnginePart(name, price);
            } else {
                part = new BrakePart(name, price);
            }

            System.out.println("\nPart Details:");
            part.printDetails();
            part.category();

            Sellable sell = (Sellable) part;
            sell.sellPart();

            Manager manager = new Manager("Alex");
            manager.work();

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter the correct data type.");
        } finally {
            System.out.println("System execution finished.");
        }

        input.close();
    }
}
