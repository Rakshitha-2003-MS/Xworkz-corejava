class AirPurifierExecutor {

    public static void main(String[] args){

        String brand = AirPurifier.getBrand();
        int area = AirPurifier.getCoverageArea();
        boolean hepa = AirPurifier.hasHEPAFilter();
        boolean indicator = AirPurifier.hasAirQualityIndicator();
        int speed = AirPurifier.getFanSpeedLevels();
        double price = AirPurifier.getPrice();

        System.out.println("The brand of the air purifier is " + brand);
        System.out.println("The coverage area of the air purifier is " + area + " sq ft");
        System.out.println("The HEPA filter availability in the air purifier is " + hepa);
        System.out.println("The air quality indicator availability in the air purifier is " + indicator);
        System.out.println("The fan speed levels in the air purifier are " + speed);
        System.out.println("The price of the air purifier is " + price);
    }
}