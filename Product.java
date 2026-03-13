public abstract class Product implements Printable {

    private String partName;
    private double price;

    public Product(String partName, double price) {
        this.partName = partName;
        this.price = price;
    }

    public String getPartName() {
        return partName;
    }

    public double getPrice() {
        return price;
    }

    public abstract void category();
}