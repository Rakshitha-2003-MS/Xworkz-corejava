class CoffeeMakerExecuter {

    public static void main(String[] args) {

        // Turn coffee maker ON
        boolean status = CoffeeMaker.onOrOff();
        System.out.println("The coffee maker status is " + status);

        // Increasing strength until max
        int strength1 = CoffeeMaker.increaseStrength();
        System.out.println("The current coffee strength level is " + strength1);

        int strength2 = CoffeeMaker.increaseStrength();
        System.out.println("The current coffee strength level is " + strength2);

        int strength3 = CoffeeMaker.increaseStrength();
        System.out.println("The current coffee strength level is " + strength3);

        int strength4 = CoffeeMaker.increaseStrength();
        System.out.println("The current coffee strength level is " + strength4);

        int strength5 = CoffeeMaker.increaseStrength(); // Should print "Maximum strength level reached"
        System.out.println("The current coffee strength level is " + strength5);

        // Decreasing strength until min
        int strength6 = CoffeeMaker.decreaseStrength();
        System.out.println("The current coffee strength level is " + strength6);

        int strength7 = CoffeeMaker.decreaseStrength();
        System.out.println("The current coffee strength level is " + strength7);

        int strength8 = CoffeeMaker.decreaseStrength();
        System.out.println("The current coffee strength level is " + strength8);

        int strength9 = CoffeeMaker.decreaseStrength();
        System.out.println("The current coffee strength level is " + strength9);

        int strength10 = CoffeeMaker.decreaseStrength(); // Should print "Minimum strength level reached"
        System.out.println("The current coffee strength level is " + strength10);

        // Final Status
        System.out.println("The final coffee strength level is " + CoffeeMaker.strengthLevel);
        System.out.println("The coffee maker is currently brewing status is " + CoffeeMaker.isBrewing);
    }
}
