class InverterExecutor {

    public static void main(String[] args){

        String brand = Inverter.getBrand();
        int battery = Inverter.getBatteryCapacity();
        boolean overload = Inverter.hasOverloadProtection();
        boolean display = Inverter.hasSmartDisplay();
        int backup = Inverter.getBackupTime();
        double price = Inverter.getPrice();

        System.out.println("The brand of the inverter is " + brand);
        System.out.println("The battery capacity of the inverter is " + battery + " Ah");
        System.out.println("The overload protection availability in the inverter is " + overload);
        System.out.println("The smart display availability in the inverter is " + display);
        System.out.println("The backup time of the inverter is " + backup + " hours");
        System.out.println("The price of the inverter is " + price);
    }
}