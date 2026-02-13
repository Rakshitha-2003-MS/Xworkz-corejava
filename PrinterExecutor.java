class PrinterExecutor {

    public static void main(String[] args){

        String brand = Printer.getBrand();
        String type = Printer.getPrintingType();
        int speed = Printer.getPrintSpeed();
        String connect = Printer.getConnectivity();
        int capacity = Printer.getPaperCapacity();
        double price = Printer.getPrice();

        System.out.println("The brand of the printer is " + brand);
        System.out.println("The printing type of the printer is " + type);
        System.out.println("The print speed of the printer is " + speed + " pages per minute");
        System.out.println("The connectivity options available in the printer are " + connect);
        System.out.println("The paper capacity of the printer is " + capacity + " sheets");
        System.out.println("The price of the printer is " + price);
    }
}