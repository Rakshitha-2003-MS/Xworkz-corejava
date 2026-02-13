class MixerGrinderExecutor {

    public static void main(String[] args){

        String brand = MixerGrinder.getBrand();
        int power = MixerGrinder.getPower();
        int jars = MixerGrinder.getNumberOfJars();
        String material = MixerGrinder.getMaterial();
        String speed = MixerGrinder.getSpeedSettings();
        double price = MixerGrinder.getPrice();

        System.out.println("The brand of the mixer grinder is " + brand);
        System.out.println("The power of the mixer grinder is " + power + " Watts");
        System.out.println("The number of jars available in the mixer grinder is " + jars);
        System.out.println("The material used in the mixer grinder is " + material);
        System.out.println("The speed settings available in the mixer grinder are " + speed);
        System.out.println("The price of the mixer grinder is " + price);
    }
}