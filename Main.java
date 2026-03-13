public class Main {
    public static void main(String[] args) {

        EnginePart e1 = new EnginePart("Piston", 120);
        BrakePart b1 = new BrakePart("Brake Pad", 45);

        ShopManager manager = new ShopManager("John", 1001);

        e1.printDetails();
        e1.category();
        e1.sellPart();

        System.out.println();

        b1.printDetails();
        b1.category();
        b1.sellPart();

        System.out.println();

        manager.work();
    }
}
