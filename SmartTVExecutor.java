class SmartTVExecutor {

    public static void main(String[] args){

        String brand = SmartTV.getBrand();
        int size = SmartTV.getScreenSize();
        String resolution = SmartTV.getResolution();
        String display = SmartTV.getDisplayType();
        int hdmi = SmartTV.getHdmiPorts();
        int sound = SmartTV.getSoundOutput();
        double price = SmartTV.getPrice();

        System.out.println("The brand of the smart TV is " + brand);
        System.out.println("The screen size of the smart TV is " + size + " inches");
        System.out.println("The resolution of the smart TV is " + resolution);
        System.out.println("The display type of the smart TV is " + display);
        System.out.println("The number of HDMI ports available in the smart TV is " + hdmi);
        System.out.println("The sound output of the smart TV is " + sound + " Watts");
        System.out.println("The price of the smart TV is " + price);
    }
}
