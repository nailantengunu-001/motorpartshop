public class BrakePart extends Product implements Sellable {

    public BrakePart(String partName, double price) {
        super(partName, price);
    }

    @Override
    public void category() {
        System.out.println("Category: Brake Part");
    }

    @Override
    public void sellPart() {
        System.out.println(getPartName() + " has been sold.");
    }

    @Override
    public void printDetails() {
        System.out.println("Part: " + getPartName());
        System.out.println("Price: $" + getPrice());
    }
}