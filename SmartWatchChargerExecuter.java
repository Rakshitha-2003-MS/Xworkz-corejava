class SmartWatchChargerExecuter {

    public static void main(String[] args) {

        // Turn charger ON
        boolean status = SmartWatchCharger.onOrOff();
        System.out.println("The smart watch charger status is " + status);

        // Increasing battery level until max
        int battery1 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery1 + "%");

        int battery2 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery2 + "%");

        int battery3 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery3 + "%");

        int battery4 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery4 + "%");

        int battery5 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery5 + "%");

        int battery6 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery6 + "%");

        int battery7 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery7 + "%");

        int battery8 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery8 + "%");

        int battery9 = SmartWatchCharger.increaseBatteryLevel();
        System.out.println("The current battery level is " + battery9 + "%");

        int battery10 = SmartWatchCharger.increaseBatteryLevel(); // Should print "Battery is fully charged"
        System.out.println("The current battery level is " + battery10 + "%");

        // Decreasing battery level until min
        int battery11 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery11 + "%");

        int battery12 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery12 + "%");

        int battery13 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery13 + "%");

        int battery14 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery14 + "%");

        int battery15 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery15 + "%");

        int battery16 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery16 + "%");

        int battery17 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery17 + "%");

        int battery18 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery18 + "%");

        int battery19 = SmartWatchCharger.decreaseBatteryLevel();
        System.out.println("The current battery level is " + battery19 + "%");

        int battery20 = SmartWatchCharger.decreaseBatteryLevel(); // Should print "Battery is completely drained"
        System.out.println("The current battery level is " + battery20 + "%");

        // Final Status
        System.out.println("The final battery level of the smart watch is " + SmartWatchCharger.batteryLevel + "%");
        System.out.println("The smart watch charger is currently charging status is " + SmartWatchCharger.isCharging);
    }
}
