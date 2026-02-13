class LightExecuter {

    public static void main(String[] args) {

        boolean status = Light.onOrOff();
        System.out.println("The light glowing status is " + status);

        // Increasing Brightness
        int level1 = Light.increaseBrightness();
        System.out.println("The brightness after increase is " + level1);

        int level2 = Light.increaseBrightness();
        System.out.println("The brightness after increase is " + level2);

        int level3 = Light.increaseBrightness();
        System.out.println("The brightness after increase is " + level3);

        // Decreasing Brightness
        int level4 = Light.decreaseBrightness();
        System.out.println("The brightness after decrease is " + level4);

        int level5 = Light.decreaseBrightness();
        System.out.println("The brightness after decrease is " + level5);

        int level6 = Light.decreaseBrightness();
        System.out.println("The brightness after decrease is " + level6);

        // Ending Status
        System.out.println("The final brightness level of the light is " + level6);
        System.out.println("The light is currently glowing status is " + Light.isGlowing);

    }
}
