class ElectricCarChargerExecutor {

    public static void main(String[] args){

        String brand = ElectricCarCharger.getBrand();
        int power = ElectricCarCharger.getChargingPower();
        boolean fast = ElectricCarCharger.hasFastCharging();
        boolean heat = ElectricCarCharger.hasOverheatProtection();
        int length = ElectricCarCharger.getCableLength();
        double price = ElectricCarCharger.getPrice();

        System.out.println("The brand of the electric car charger is " + brand);
        System.out.println("The charging power of the electric car charger is " + power + " kW");
        System.out.println("The fast charging availability in the electric car charger is " + fast);
        System.out.println("The overheat protection availability in the electric car charger is " + heat);
        System.out.println("The cable length of the electric car charger is " + length + " meters");
        System.out.println("The price of the electric car charger is " + price);
    }
}