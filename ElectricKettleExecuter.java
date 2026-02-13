class ElectricKettleExecuter {

    public static void main(String[] args) {

        // Turn kettle ON
        boolean status = ElectricKettle.onOrOff();
        System.out.println("The electric kettle status is " + status);

        // Increasing water level until max
        int water1 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water1 + " ml");

        int water2 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water2 + " ml");

        int water3 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water3 + " ml");

        int water4 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water4 + " ml");

        int water5 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water5 + " ml");

        int water6 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water6 + " ml");

        int water7 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water7 + " ml");

        int water8 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water8 + " ml");

        int water9 = ElectricKettle.increaseWaterLevel();
        System.out.println("The current water level is " + water9 + " ml");

        int water10 = ElectricKettle.increaseWaterLevel(); // Should print "Maximum water level reached"
        System.out.println("The current water level is " + water10 + " ml");

        // Decreasing water level until min
        int water11 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water11 + " ml");

        int water12 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water12 + " ml");

        int water13 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water13 + " ml");

        int water14 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water14 + " ml");

        int water15 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water15 + " ml");

        int water16 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water16 + " ml");

        int water17 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water17 + " ml");

        int water18 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water18 + " ml");

        int water19 = ElectricKettle.decreaseWaterLevel();
        System.out.println("The current water level is " + water19 + " ml");

        int water20 = ElectricKettle.decreaseWaterLevel(); // Should print "Minimum water level reached"
        System.out.println("The current water level is " + water20 + " ml");

        // Final Status
        System.out.println("The final water level of the electric kettle is " + ElectricKettle.currentWaterLevel + " ml");
        System.out.println("The electric kettle is currently boiling status is " + ElectricKettle.isBoiling);
    }
}
