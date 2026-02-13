class DishwasherExecutor {

    public static void main(String[] args){

        String brand = Dishwasher.getBrand();
        int capacity = Dishwasher.getCapacity();
        int water = Dishwasher.getWaterConsumption();
        boolean childLock = Dishwasher.hasChildLock();
        boolean quickWash = Dishwasher.hasQuickWash();
        double price = Dishwasher.getPrice();

        System.out.println("The brand of the dishwasher is " + brand);
        System.out.println("The capacity of the dishwasher is " + capacity + " place settings");
        System.out.println("The water consumption of the dishwasher is " + water + " litres per cycle");
        System.out.println("The child lock availability in the dishwasher is " + childLock);
        System.out.println("The quick wash feature availability in the dishwasher is " + quickWash);
        System.out.println("The price of the dishwasher is " + price);
    }
}