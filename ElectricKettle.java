class ElectricKettle {

    static boolean isBoiling;
    static int currentWaterLevel = 500;   // in milliliters
    static int maxWaterLevel = 1500;
    static int minWaterLevel = 200;

    static boolean onOrOff() {

        if (isBoiling == false) {
            isBoiling = true;
            System.out.println("Electric kettle started boiling water");
        } else if (isBoiling == true) {
            isBoiling = false;
            System.out.println("Electric kettle switched off");
        }

        return isBoiling;
    }

    static int increaseWaterLevel() {

        System.out.println("Increase Water Level is invoked");

        if (isBoiling == true) {

            if (currentWaterLevel < maxWaterLevel) {
                currentWaterLevel = currentWaterLevel + 100;
                System.out.println("Current water level is " + currentWaterLevel + " ml");
            } else {
                System.out.println("Maximum water level reached");
            }

        } else {
            System.out.println("Electric kettle is Off. Please turn it On");
        }

        return currentWaterLevel;
    }

    static int decreaseWaterLevel() {

        System.out.println("Decrease Water Level is invoked");

        if (isBoiling == true) {

            if (currentWaterLevel > minWaterLevel) {
                currentWaterLevel = currentWaterLevel - 100;
                System.out.println("Current water level is " + currentWaterLevel + " ml");
            } else {
                System.out.println("Minimum water level reached");
            }

        } else {
            System.out.println("Electric kettle is Off. Please turn it On");
        }

        return currentWaterLevel;
    }
}
