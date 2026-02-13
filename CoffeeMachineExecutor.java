class CoffeeMachineExecutor {

    public static void main(String[] args){

        String brand = CoffeeMachine.getBrand();
        int tank = CoffeeMachine.getWaterTankCapacity();
        boolean frother = CoffeeMachine.hasMilkFrother();
        boolean shutoff = CoffeeMachine.hasAutoShutOff();
        int pressure = CoffeeMachine.getPressureBar();
        double price = CoffeeMachine.getPrice();

        System.out.println("The brand of the coffee machine is " + brand);
        System.out.println("The water tank capacity of the coffee machine is " + tank + " ml");
        System.out.println("The milk frother availability in the coffee machine is " + frother);
        System.out.println("The auto shut off feature availability in the coffee machine is " + shutoff);
        System.out.println("The pressure level of the coffee machine is " + pressure + " bar");
        System.out.println("The price of the coffee machine is " + price);
    }
}
