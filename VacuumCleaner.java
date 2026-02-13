class VacuumCleaner {

    static boolean isSuctionOn;
    static int suctionLevel = 2;
    static int maxSuctionLevel = 5;
    static int minSuctionLevel = 1;

    static boolean onOrOff() {

        if (isSuctionOn == false) {
            isSuctionOn = true;
            System.out.println("Vacuum cleaner began suction");
        } else if (isSuctionOn == true) {
            isSuctionOn = false;
            System.out.println("Vacuum cleaner stopped working");
        }

        return isSuctionOn;
    }

    static int increaseSuction() {

        System.out.println("Increase Suction is invoked");

        if (isSuctionOn == true) {

            if (suctionLevel < maxSuctionLevel) {
                suctionLevel = suctionLevel + 1;
                System.out.println("Current suction level is " + suctionLevel);
            } else {
                System.out.println("Maximum suction level reached");
            }

        } else {
            System.out.println("Vacuum cleaner is Off. Please turn it On");
        }

        return suctionLevel;
    }

    static int decreaseSuction() {

        System.out.println("Decrease Suction is invoked");

        if (isSuctionOn == true) {

            if (suctionLevel > minSuctionLevel) {
                suctionLevel = suctionLevel - 1;
                System.out.println("Current suction level is " + suctionLevel);
            } else {
                System.out.println("Minimum suction level reached");
            }

        } else {
            System.out.println("Vacuum cleaner is Off. Please turn it On");
        }

        return suctionLevel;
    }
}
