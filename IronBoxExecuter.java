class IronBoxExecuter {

    public static void main(String[] args) {

        // Turn IronBox ON
        boolean status = IronBox.onOrOff();
        System.out.println("The iron box heating status is " + status);

        // Increasing Temperature until max
        int temp1 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp1 + " degree Celsius");

        int temp2 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp2 + " degree Celsius");

        int temp3 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp3 + " degree Celsius");

        int temp4 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp4 + " degree Celsius");

        int temp5 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp5 + " degree Celsius");

        int temp6 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp6 + " degree Celsius");

        int temp7 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp7 + " degree Celsius");

        int temp8 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp8 + " degree Celsius");

        int temp9 = IronBox.increaseTemperature();
        System.out.println("The current temperature is " + temp9 + " degree Celsius");

        int temp10 = IronBox.increaseTemperature(); // Should print "Maximum temperature limit reached"
        System.out.println("The current temperature is " + temp10 + " degree Celsius");

        // Decreasing Temperature until min
        int temp11 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp11 + " degree Celsius");

        int temp12 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp12 + " degree Celsius");

        int temp13 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp13 + " degree Celsius");

        int temp14 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp14 + " degree Celsius");

        int temp15 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp15 + " degree Celsius");

        int temp16 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp16 + " degree Celsius");

        int temp17 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp17 + " degree Celsius");

        int temp18 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp18 + " degree Celsius");

        int temp19 = IronBox.decreaseTemperature();
        System.out.println("The current temperature is " + temp19 + " degree Celsius");

        int temp20 = IronBox.decreaseTemperature(); // Should print "Minimum temperature limit reached"
        System.out.println("The current temperature is " + temp20 + " degree Celsius");

        // Final Status
        System.out.println("The final temperature of the iron box is " + IronBox.currentTemperature + " degree Celsius");
        System.out.println("The iron box is currently heating status is " + IronBox.isHeating);

    }
}
