class WashingMachineExecutor {

    public static void main(String[] args){

        String brand = WashingMachine.getBrand();
        String capacity = WashingMachine.getCapacity();
        String colour = WashingMachine.getColour();
        String dimensions = WashingMachine.getProductDimensions();
        String feature = WashingMachine.getSpecialFeature();
        String cycles = WashingMachine.getCycleOptions();
        int voltage = WashingMachine.getVoltage();
        String control = WashingMachine.getControlsType();
        int speed = WashingMachine.getMaximumRotationalSpeed();
        String access = WashingMachine.getAccessLocation();

        System.out.println("The brand of the washing machine is " + brand);
        System.out.println("The capacity of the washing machine is " + capacity);
        System.out.println("The colour of the washing machine is " + colour);
        System.out.println("The product dimensions of the washing machine are " + dimensions);
        System.out.println("The special features of the washing machine include " + feature);
        System.out.println("The available cycle options in the washing machine are " + cycles);
        System.out.println("The required voltage for the washing machine is " + voltage + " Volts");
        System.out.println("The control type of the washing machine is " + control);
        System.out.println("The maximum rotational speed of the washing machine is " + speed + " RPM");
        System.out.println("The access location of the washing machine is " + access);
    }
}