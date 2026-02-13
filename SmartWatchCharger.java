class SmartWatchCharger {

    static boolean isCharging;
    static int batteryLevel = 40;   // percentage
    static int maxBatteryLevel = 100;
    static int minBatteryLevel = 0;

    static boolean onOrOff() {

        if (isCharging == false) {
            isCharging = true;
            System.out.println("Smart watch charger started charging");
        } else if (isCharging == true) {
            isCharging = false;
            System.out.println("Smart watch charger unplugged");
        }

        return isCharging;
    }

    static int increaseBatteryLevel() {

        System.out.println("Increase Battery Level is invoked");

        if (isCharging == true) {

            if (batteryLevel < maxBatteryLevel) {
                batteryLevel = batteryLevel + 5;
                System.out.println("Current battery level is " + batteryLevel + "%");
            } else {
                System.out.println("Battery is fully charged");
            }

        } else {
            System.out.println("Charger is not connected. Please turn it On");
        }

        return batteryLevel;
    }

    static int decreaseBatteryLevel() {

        System.out.println("Decrease Battery Level is invoked");

        if (isCharging == true) {

            if (batteryLevel > minBatteryLevel) {
                batteryLevel = batteryLevel - 5;
                System.out.println("Current battery level is " + batteryLevel + "%");
            } else {
                System.out.println("Battery is completely drained");
            }

        } else {
            System.out.println("Charger is not connected. Please turn it On");
        }

        return batteryLevel;
    }
}
