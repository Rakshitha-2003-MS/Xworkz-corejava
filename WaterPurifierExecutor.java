class WaterPurifierExecutor {

    public static void main(String[] args){

        String brand = WaterPurifier.getBrand();
        String tech = WaterPurifier.getPurificationTechnology();
        int storage = WaterPurifier.getStorageCapacity();
        int power = WaterPurifier.getPower();
        String install = WaterPurifier.getInstallationType();
        double price = WaterPurifier.getPrice();

        System.out.println("The brand of the water purifier is " + brand);
        System.out.println("The purification technology used in the water purifier is " + tech);
        System.out.println("The storage capacity of the water purifier is " + storage + " Litres");
        System.out.println("The power consumption of the water purifier is " + power + " Watts");
        System.out.println("The installation type of the water purifier is " + install);
        System.out.println("The price of the water purifier is " + price);
    }
}