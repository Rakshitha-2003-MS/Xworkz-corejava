class AirConditionerExecutor {

    public static void main(String[] args){

        String brand = AirConditioner.getBrand();
        double tonnage = AirConditioner.getTonnage();
        String rating = AirConditioner.getEnergyRating();
        String inverter = AirConditioner.getInverterType();
        int cooling = AirConditioner.getCoolingCapacity();
        int voltage = AirConditioner.getVoltage();
        double price = AirConditioner.getPrice();

        System.out.println("The brand of the air conditioner is " + brand);
        System.out.println("The tonnage of the air conditioner is " + tonnage + " Ton");
        System.out.println("The energy rating of the air conditioner is " + rating);
        System.out.println("The inverter availability in the air conditioner is " + inverter);
        System.out.println("The cooling capacity of the air conditioner is " + cooling);
        System.out.println("The required voltage of the air conditioner is " + voltage + " Volts");
        System.out.println("The price of the air conditioner is " + price);
    }
}