class TreadmillExecutor {

    public static void main(String[] args){

        String brand = Treadmill.getBrand();
        int motor = Treadmill.getMotorPower();
        boolean heart = Treadmill.hasHeartRateMonitor();
        boolean incline = Treadmill.hasAutoIncline();
        int weight = Treadmill.getMaxWeightCapacity();
        double price = Treadmill.getPrice();

        System.out.println("The brand of the treadmill is " + brand);
        System.out.println("The motor power of the treadmill is " + motor + " HP");
        System.out.println("The heart rate monitor availability in the treadmill is " + heart);
        System.out.println("The auto incline feature availability in the treadmill is " + incline);
        System.out.println("The maximum weight capacity of the treadmill is " + weight + " kg");
        System.out.println("The price of the treadmill is " + price);
    }
}