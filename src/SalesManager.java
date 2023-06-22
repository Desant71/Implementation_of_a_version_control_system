public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = max();
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long stat() {
        long sum = 0;
        long srd = 0;
        long sum2 = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
            sum2 = sum - min() - max();
            srd = (sum2 / sales.length) ;
        }
        return srd;
    }
}
