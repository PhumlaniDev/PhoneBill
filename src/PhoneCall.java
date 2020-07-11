public class PhoneCall implements BillAction{

    private double total;

    public PhoneCall(double total) {
        this.total = total;
    }

    @Override
    public double totalCost() {
        return total;
    }
}
