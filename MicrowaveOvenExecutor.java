class MicrowaveOvenExecutor {

    public static void main(String[] args){

        String brand = MicrowaveOven.getBrand();
        int capacity = MicrowaveOven.getCapacity();
        int power = MicrowaveOven.getPower();
        String control = MicrowaveOven.getControlType();
        String autoCook = MicrowaveOven.getAutoCookMenu();
        String colour = MicrowaveOven.getColour();
        double price = MicrowaveOven.getPrice();

        System.out.println("The brand of the microwave oven is " + brand);
        System.out.println("The capacity of the microwave oven is " + capacity + " Litres");
        System.out.println("The power consumption of the microwave oven is " + power + " Watts");
        System.out.println("The control type of the microwave oven is " + control);
        System.out.println("The auto cook menu availability in the microwave oven is " + autoCook);
        System.out.println("The colour of the microwave oven is " + colour);
        System.out.println("The price of the microwave oven is " + price);
    }
}