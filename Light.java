class Light {

    static boolean isGlowing;
    static int brightnessLevel = 3;
    static int maxBrightness = 5;
    static int minBrightness = 1;

    static boolean onOrOff() {

        if (isGlowing == false) {
            isGlowing = true;
            System.out.println("Light began to glow");
        } else if (isGlowing == true) {
            isGlowing = false;
            System.out.println("Light went dark");
        }

        return isGlowing;
    }

    static int increaseBrightness() {

        System.out.println("Increase Brightness is invoked");

        if (isGlowing == true) {

            if (brightnessLevel < maxBrightness) {
                brightnessLevel = brightnessLevel + 1;
                System.out.println("Current brightness level is " + brightnessLevel);
            } else {
                System.out.println("Maximum brightness level reached");
            }

        } else {
            System.out.println("Light is Off. Please turn it On");
        }

        return brightnessLevel;
    }

    static int decreaseBrightness() {

        System.out.println("Decrease Brightness is invoked");

        if (isGlowing == true) {

            if (brightnessLevel > minBrightness) {
                brightnessLevel = brightnessLevel - 1;
                System.out.println("Current brightness level is " + brightnessLevel);
            } else {
                System.out.println("Minimum brightness level reached");
            }

        } else {
            System.out.println("Light is Off. Please turn it On");
        }

        return brightnessLevel;
    }
}
