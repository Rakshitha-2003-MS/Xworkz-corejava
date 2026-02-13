class BluetoothSpeakerExecutor {

    public static void main(String[] args){

        String brand = BluetoothSpeaker.getBrand();
        int battery = BluetoothSpeaker.getBatteryBackup();
        int power = BluetoothSpeaker.getOutputPower();
        String version = BluetoothSpeaker.getBluetoothVersion();
        String rating = BluetoothSpeaker.getWaterproofRating();
        double price = BluetoothSpeaker.getPrice();

        System.out.println("The brand of the Bluetooth speaker is " + brand);
        System.out.println("The battery backup of the Bluetooth speaker is " + battery + " hours");
        System.out.println("The output power of the Bluetooth speaker is " + power + " Watts");
        System.out.println("The Bluetooth version supported by the speaker is " + version);
        System.out.println("The waterproof rating of the Bluetooth speaker is " + rating);
        System.out.println("The price of the Bluetooth speaker is " + price);
    }
}