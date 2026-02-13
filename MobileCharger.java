class MobileCharger {

    static boolean isSupplying;
    static int chargingLevel = 50;       // percentage
    static int maxChargingLevel = 100;
    static int minChargingLevel = 0;
    static int step = 10;                // step for increase/decrease

    static boolean onOrOff() {

        if (isSupplying == false) {
            isSupplying = true;
            System.out.println("Mobile charger started charging");
        } else if (isSupplying == true) {
            isSupplying = false;
            System.out.println("Mobile charger disconnected");
        }

        return isSupplying;
    }

    static int increaseChargingLevel() {

        System.out.println("Increase Charging Level is invoked");

        if (isSupplying == true) {

            if (chargingLevel < maxChargingLevel) {
                chargingLevel = chargingLevel + step; // increase by step
                if(chargingLevel > maxChargingLevel)
