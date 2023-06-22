public class Main {
    public static void main(String[] args) {
        long[] price = {100,325,326,68769};

        SalesManager salesManager = new SalesManager(price);

        System.out.println("Max значение = " + salesManager.max());
        System.out.println("Min значение = " + salesManager.min());
        System.out.println("Среднее значение = " + salesManager.stat());





    }
}