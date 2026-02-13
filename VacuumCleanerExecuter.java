class VacuumCleanerExecuter {

    public static void main(String[] args) {

        // Turn vacuum cleaner ON
        boolean status = VacuumCleaner.onOrOff();
        System.out.println("The vacuum cleaner status is " + status);

        // Increasing suction until max
        int suction1 = VacuumCleaner.increaseSuction();
        System.out.println("The current suction level is " + suction1);

        int suction2 = VacuumCleaner.increaseSuction();
        System.out.println("The current suction level is " + suction2);

        int suction3 = VacuumCleaner.increaseSuction();
        System.out.println("The current suction level is " + suction3);

        int suction4 = VacuumCleaner.increaseSuction();
        System.out.println("The current suction level is " + suction4);

        int suction5 = VacuumCleaner.increaseSuction(); // Should print "Maximum suction level reached"
        System.out.println("The current suction level is " + suction5);

        // Decreasing suction until min
        int suction6 = VacuumCleaner.decreaseSuction();
        System.out.println("The current suction level is " + suction6);

        int suction7 = VacuumCleaner.decreaseSuction();
        System.out.println("The current suction level is " + suction7);

        int suction8 = VacuumCleaner.decreaseSuction();
        System.out.println("The current suction level is " + suction8);

        int suction9 = VacuumCleaner.decreaseSuction();
        System.out.println("The current suction level is " + suction9);

        int suction10 = VacuumCleaner.decreaseSuction(); // Should print "Minimum suction level reached"
        System.out.println("The current suction level is " + suction10);

        // Final Status
        System.out.println("The final suction level of the vacuum cleaner is " + VacuumCleaner.suctionLevel);
        System.out.println("The vacuum cleaner is currently operating status is " + VacuumCleaner.isSuctionOn);
    }
}
