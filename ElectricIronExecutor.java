class ElectricIronExecutor {

    public static void main(String[] args){

        String brand = ElectricIron.getBrand();
        int power = ElectricIron.getPower();
        String plate = ElectricIron.getSoleplateType();
        boolean steam = ElectricIron.getSteamFunction();
        int tank = ElectricIron.getWaterTankCapacity();
        double price = ElectricIron.getPrice();

        System.out.println("The brand of the electric iron is " + brand);
        System.out.println("The power of the electric iron is " + power + " Watts");
        System.out.println("The soleplate type of the electric iron is " + plate);
        System.out.println("The steam function availability in the electric iron is " + steam);
        System.out.println("The water tank capacity of the electric iron is " + tank + " ml");
        System.out.println("The price of the electric iron is " + price);
    }
}