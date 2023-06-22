public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = max();
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int stat() {
        int sum = 0;
        int srd = 0;
        int sum2 = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            sum2 = sum - min() - max();
            srd = (sum2 / sales.length) ;
        }
        return srd;
    }
}
