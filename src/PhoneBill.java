public class PhoneBill{

    private double total;

    public void accept(BillAction billAction){
        System.out.println("Your bill before increment: " + billAction.totalCost());
        total += billAction.totalCost();
        System.out.println("Your bill after increment: " + total);
    }


    public double totalCost() {
        return total;
    }
}
