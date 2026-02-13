class Microwave {

    static boolean isOperating;
    static int currentTimer = 30; // seconds
    static int maxTimer = 300;    // 5 minutes
    static int minTimer = 10;     // 10 seconds
    static int step = 10;         // step for increase/decrease

    static boolean onOrOff() {

        if (isOperating == false) {
            isOperating = true;
            System.out.println("Microwave is started");
        } else if (isOperating == true) {
            isOperating = false;
            System.out.println("Microwave is stopped");
        }

        return isOperating;
    }

    static int increaseTimer() {

        System.out.println("Increase Timer is invoked");

        if (isOperating == true) {

            if (currentTimer < maxTimer) {
                currentTimer = currentTimer + step; // increase by step
                System.out.println("Current timer is set to " + currentTimer + " seconds");
            } else {
                System.out.println("Maximum timer limit reached");
            }

        } else {
            System.out.println("Microwave is Off. Please turn it On");
        }

        return currentTimer;
    }

    static int decreaseTimer() {

        System.out.println("Decrease Timer is invoked");

        if (isOperating == true) {

            if (currentTimer > minTimer) {
                currentTimer = currentTimer - step; // decrease by step
                System.out.println("Current timer is set to " + currentTimer + " seconds");
            } else {
                System.out.println("Minimum timer limit reached");
            }

        } else {
            System.out.println("Microwave is Off. Please turn it On");
        }

        return currentTimer;
    }
}
