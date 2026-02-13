class HomeTheatreExecutor {

    public static void main(String[] args){

        String brand = HomeTheatre.getBrand();
        int speakers = HomeTheatre.getTotalSpeakers();
        boolean bluetooth = HomeTheatre.hasBluetoothConnectivity();
        boolean dolby = HomeTheatre.hasDolbySupport();
        int power = HomeTheatre.getPowerOutput();
        double price = HomeTheatre.getPrice();

        System.out.println("The brand of the home theatre system is " + brand);
        System.out.println("The total number of speakers in the home theatre system is " + speakers);
        System.out.println("The Bluetooth connectivity availability in the home theatre system is " + bluetooth);
        System.out.println("The Dolby support availability in the home theatre system is " + dolby);
        System.out.println("The power output of the home theatre system is " + power + " watts");
        System.out.println("The price of the home theatre system is " + price);
    }
}