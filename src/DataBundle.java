public class DataBundle implements BillAction{

    private double mb;
    private double total = 0;

    public DataBundle(double mb) {
        this.mb = mb;
    }

    @Override
    public double totalCost() {
        if (mb < 500){
            total += 0.75 * mb;
        }

        else if (mb > 500){
            total += 0.55 * mb;
        }

        else if (mb > 1000){
            total += 0.35 * mb;
        }
        return total;
    }
}
