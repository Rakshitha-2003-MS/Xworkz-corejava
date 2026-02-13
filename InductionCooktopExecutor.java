class InductionCooktopExecutor {

    public static void main(String[] args){

        String brand = InductionCooktop.getBrand();
        int power = InductionCooktop.getPowerLevel();
        boolean timer = InductionCooktop.hasTimerFunction();
        boolean shutoff = InductionCooktop.hasAutoShutOff();
        int levels = InductionCooktop.getTemperatureLevels();
        double price = InductionCooktop.getPrice();

        System.out.println("The brand of the induction cooktop is " + brand);
        System.out.println("The power level of the induction cooktop is " + power + " watts");
        System.out.println("The timer function availability in the induction cooktop is " + timer);
        System.out.println("The auto shut off availability in the induction cooktop is " + shutoff);
        System.out.println("The temperature levels in the induction cooktop are " + levels);
        System.out.println("The price of the induction cooktop is " + price);
    }
}