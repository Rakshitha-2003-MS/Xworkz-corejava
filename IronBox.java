class IronBox {

    static boolean isHeating;
    static int currentTemperature = 120;   // in degree Celsius
    static int maxTemperature = 220;
    static int minTemperature = 80;

    static boolean onOrOff() {

        if (isHeating == false) {
            isHeating = true;
            System.out.println("Iron box started getting hot");
        } else if (isHeating == true) {
            isHeating = false;
            System.out.println("Iron box cooled down");
        }

        return isHeating;
    }

    static int increaseTemperature() {

        System.out.println("Increase Temperature is invoked");

        if (isHeating == true) {

            if (currentTemperature < maxTemperature) {
                currentTemperature = currentTemperature + 10;
                System.out.println("Current temperature is " + currentTemperature + " degree Celsius");
            } else {
                System.out.println("Maximum temperature limit reached");
            }

        } else {
            System.out.println("Iron box is Off. Please turn it On");
        }

        return currentTemperature;
    }

    static int decreaseTemperature() {

        System.out.println("Decrease Temperature is invoked");

        if (isHeating == true) {

            if (currentTemperature > minTemperature) {
                currentTemperature = currentTemperature - 10;
                System.out.println("Current temperature is " + currentTemperature + " degree Celsius");
            } else {
                System.out.println("Minimum temperature limit reached");
            }

        } else {
            System.out.println("Iron box is Off. Please turn it On");
        }

        return currentTemperature;
    }
}
