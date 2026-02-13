class RefrigeratorExecutor {

    public static void main(String[] args){

        String brand = Refrigerator.getBrand();
        int capacity = Refrigerator.getCapacity();
        String rating = Refrigerator.getEnergyRating();
        String cooling = Refrigerator.getCoolingType();
        String compressor = Refrigerator.getCompressorType();
        String colour = Refrigerator.getColour();
        int voltage = Refrigerator.getVoltage();
        double price = Refrigerator.getPrice();

        System.out.println("The brand of the refrigerator is " + brand);
        System.out.println("The capacity of the refrigerator is " + capacity + " Litres");
        System.out.println("The energy rating of the refrigerator is " + rating);
        System.out.println("The cooling type of the refrigerator is " + cooling);
        System.out.println("The compressor type of the refrigerator is " + compressor);
        System.out.println("The colour of the refrigerator is " + colour);
        System.out.println("The required voltage of the refrigerator is " + voltage + " Volts");
        System.out.println("The price of the refrigerator is " + price);
    }
}