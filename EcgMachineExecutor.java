class EcgMachineExecutor {

    public static void main(String[] args){

        String brand = EcgMachine.getBrand();
        int channels = EcgMachine.getChannels();
        boolean display = EcgMachine.hasDigitalDisplay();
        boolean usb = EcgMachine.hasUSBSupport();
        int hours = EcgMachine.getBatteryHours();
        double price = EcgMachine.getPrice();

        System.out.println("The brand of the ECG machine is " + brand);
        System.out.println("The number of channels in the ECG machine is " + channels);
        System.out.println("The digital display availability in the ECG machine is " + display);
        System.out.println("The USB support availability in the ECG machine is " + usb);
        System.out.println("The battery backup of the ECG machine is " + hours + " hours");
        System.out.println("The price of the ECG machine is " + price);
    }
}