public class ShopManager extends Employee {

    public ShopManager(String name, int employeeId) {
        super(name, employeeId);
    }

    @Override
    public void work() {
        System.out.println(getName() + " manages the motor parts shop.");
    }
}