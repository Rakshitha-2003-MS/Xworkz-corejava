class CeilingFanExecutor {

    public static void main(String[] args){

        String brand = CeilingFan.getBrand();
        int blade = CeilingFan.getBladeSize();
        int speed = CeilingFan.getSpeed();
        int power = CeilingFan.getPowerConsumption();
        String control = CeilingFan.getControlType();
        double price = CeilingFan.getPrice();

        System.out.println("The brand of the ceiling fan is " + brand);
        System.out.println("The blade size of the ceiling fan is " + blade + " mm");
        System.out.println("The maximum speed of the ceiling fan is " + speed + " RPM");
        System.out.println("The power consumption of the ceiling fan is " + power + " Watts");
        System.out.println("The control type of the ceiling fan is " + control);
        System.out.println("The price of the ceiling fan is " + price);
    }
}