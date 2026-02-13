class CoffeeMaker {

    static boolean isBrewing;
    static int strengthLevel = 2;
    static int maxStrengthLevel = 5;
    static int minStrengthLevel = 1;

    static boolean onOrOff() {

        if (isBrewing == false) {
            isBrewing = true;
            System.out.println("Coffee maker started brewing coffee");
        } else if (isBrewing == true) {
            isBrewing = false;
            System.out.println("Coffee maker stopped brewing");
        }

        return isBrewing;
    }

    static int increaseStrength() {

        System.out.println("Increase Strength is invoked");

        if (isBrewing == true) {

            if (strengthLevel < maxStrengthLevel) {
                strengthLevel = strengthLevel + 1;
                System.out.println("Current coffee strength level is " + strengthLevel);
            } else {
                System.out.println("Maximum strength level reached");
            }

        } else {
            System.out.println("Coffee maker is Off. Please turn it On");
        }

        return strengthLevel;
    }

    static int decreaseStrength() {

        System.out.println("Decrease Strength is invoked");

        if (isBrewing == true) {

            if (strengthLevel > minStrengthLevel) {
                strengthLevel = strengthLevel - 1;
                System.out.println("Current coffee strength level is " + strengthLevel);
            } else {
                System.out.println("Minimum strength level reached");
            }

        } else {
            System.out.println("Coffee maker is Off. Please turn it On");
        }

        return strengthLevel;
    }
}
