class DefibrillatorExecutor {

    public static void main(String[] args){

        String brand = Defibrillator.getBrand();
        int energy = Defibrillator.getEnergyLevel();
        boolean voice = Defibrillator.hasVoiceGuidance();
        boolean portable = Defibrillator.isPortable();
        int battery = Defibrillator.getBatteryLife();
        double price = Defibrillator.getPrice();

        System.out.println("The brand of the defibrillator is " + brand);
        System.out.println("The energy level of the defibrillator is " + energy + " joules");
        System.out.println("The voice guidance availability in the defibrillator is " + voice);
        System.out.println("The portability of the defibrillator is " + portable);
        System.out.println("The battery life of the defibrillator is " + battery + " hours");
        System.out.println("The price of the defibrillator is " + price);
    }
}