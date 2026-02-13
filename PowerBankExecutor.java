class PowerBankExecutor {

    public static void main(String[] args){

        String brand = PowerBank.getBrand();
        int capacity = PowerBank.getCapacity();
        boolean fast = PowerBank.getFastCharging();
        int ports = PowerBank.getOutputPorts();
        double weight = PowerBank.getWeight();
        double price = PowerBank.getPrice();

        System.out.println("The brand of the power bank is " + brand);
        System.out.println("The battery capacity of the power bank is " + capacity + " mAh");
        System.out.println("The fast charging availability in the power bank is " + fast);
        System.out.println("The number of output ports available in the power bank is " + ports);
        System.out.println("The weight of the power bank is " + weight + " grams");
        System.out.println("The price of the power bank is " + price);
    }
}