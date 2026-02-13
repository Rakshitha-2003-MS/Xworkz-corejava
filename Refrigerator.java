class Refrigerator {

    static boolean isWorking;
    static int currentTemperature = 5;
    static int maxTemperature = 10;
    static int minTemperature = 0;

    static boolean onOrOff() {

        if (isWorking == false) {
            isWorking = true;
            System.out.println("Refrigerator started cooling");
        } else if (isWorking == true) {
            isWorking = false;
            System.out.println("Refrigerator stopped cooling");
        }

        return isWorking;
    }

    static int increaseTemperature() {

        System.out.println("Increase Temperature is invoked");

        if (isWorking == true) {

            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 1;
                System.out.println("The current temperature is " + currentTemperature + " degree Celsius");
            } else {
                System.out.println("Maximum temperature limit is reached");
            }

        } else {
            System.out.println("Refrigerator is not working please turn it On");
        }

        return currentTemperature;
    }

    static int decreaseTemperature() {

        System.out.println("Decrease Temperature is invoked");

        if (isWorking == true) {

            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 1;
                System.out.println("The current temperature is " + currentTemperature + " degree Celsius");
            } else {
                System.out.println("Minimum temperature limit is reached");
            }

        } else {
            System.out.println("Refrigerator is not working please turn it On");
        }

        return currentTemperature;
    }
}
