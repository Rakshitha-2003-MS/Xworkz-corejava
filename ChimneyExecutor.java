class ChimneyExecutor {

    public static void main(String[] args){

        String brand = Chimney.getBrand();
        String dimensions = Chimney.getProductDimensions();
        String colour = Chimney.getColour();
        String feature = Chimney.getSpecialFeature();
        String finish = Chimney.getFinishType();
        int power = Chimney.getPowerConsumption();
        String control = Chimney.getControlType();
        int suction = Chimney.getSuctionCapacity();

        System.out.println("The brand of the chimney is " + brand);
        System.out.println("The product dimensions of the chimney are " + dimensions);
        System.out.println("The colour of the chimney is " + colour);
        System.out.println("The special feature available in the chimney is " + feature);
        System.out.println("The finish type of the chimney is " + finish);
        System.out.println("The power consumption of the chimney is " + power + " Watts");
        System.out.println("The control type of the chimney is " + control);
        System.out.println("The suction capacity of the chimney is " + suction + " m3/hr");
    }
}