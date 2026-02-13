class SolarWaterHeaterExecutor {

    public static void main(String[] args){

        String brand = SolarWaterHeater.getBrand();
        int capacity = SolarWaterHeater.getCapacity();
        boolean coating = SolarWaterHeater.hasAntiCorrosionCoating();
        boolean tempControl = SolarWaterHeater.hasTemperatureControl();
        int warranty = SolarWaterHeater.getWarrantyYears();
        double price = SolarWaterHeater.getPrice();

        System.out.println("The brand of the solar water heater is " + brand);
        System.out.println("The capacity of the solar water heater is " + capacity + " litres");
        System.out.println("The anti corrosion coating availability in the solar water heater is " + coating);
        System.out.println("The temperature control availability in the solar water heater is " + tempControl);
        System.out.println("The warranty period of the solar water heater is " + warranty + " years");
        System.out.println("The price of the solar water heater is " + price);
    }
}