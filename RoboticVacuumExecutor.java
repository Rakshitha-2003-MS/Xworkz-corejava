class RoboticVacuumExecutor {

    public static void main(String[] args){

        String brand = RoboticVacuum.getBrand();
        int battery = RoboticVacuum.getBatteryBackup();
        boolean autoCharge = RoboticVacuum.hasAutoCharging();
        boolean wifi = RoboticVacuum.hasWiFiConnectivity();
        int dust = RoboticVacuum.getDustCapacity();
        double price = RoboticVacuum.getPrice();

        System.out.println("The brand of the robotic vacuum cleaner is " + brand);
        System.out.println("The battery backup of the robotic vacuum cleaner is " + battery + " minutes");
        System.out.println("The auto charging feature availability in the robotic vacuum cleaner is " + autoCharge);
        System.out.println("The WiFi connectivity availability in the robotic vacuum cleaner is " + wifi);
        System.out.println("The dust capacity of the robotic vacuum cleaner is " + dust + " ml");
        System.out.println("The price of the robotic vacuum cleaner is " + price);
    }
}