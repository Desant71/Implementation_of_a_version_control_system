public class Main {
    public static void main(String[] args) {
        int[] price = {100,325,68769,3353,236878,1};

        SalesManager salesManager = new SalesManager(price);

        System.out.println("Max значение = " + salesManager.max());
        System.out.println("Min значение = " + salesManager.min());





    }
}