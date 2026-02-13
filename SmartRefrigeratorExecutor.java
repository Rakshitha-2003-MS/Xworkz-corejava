class SmartRefrigeratorExecutor {

    public static void main(String[] args){

        String brand = SmartRefrigerator.getBrand();
        int capacity = SmartRefrigerator.getCapacity();
        boolean screen = SmartRefrigerator.hasTouchScreen();
        boolean wifi = SmartRefrigerator.hasWiFi();
        int rating = SmartRefrigerator.getEnergyRating();
        double price = SmartRefrigerator.getPrice();

        System.out.println("The brand of the smart refrigerator is " + brand);
        System.out.println("The capacity of the smart refrigerator is " + capacity + " litres");
        System.out.println("The touch screen availability in the smart refrigerator is " + screen);
        System.out.println("The WiFi availability in the smart refrigerator is " + wifi);
        System.out.println("The energy rating of the smart refrigerator is " + rating + " star");
        System.out.println("The price of the smart refrigerator is " + price);
    }
}