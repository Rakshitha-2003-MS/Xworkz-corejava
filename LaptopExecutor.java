class LaptopExecutor {

    public static void main(String[] args){

        String brand = Laptop.getBrand();
        String processor = Laptop.getProcessor();
        int ram = Laptop.getRam();
        int storage = Laptop.getStorage();
        String graphics = Laptop.getGraphics();
        double screen = Laptop.getScreenSize();
        int battery = Laptop.getBatteryBackup();
        double price = Laptop.getPrice();

        System.out.println("The brand of the laptop is " + brand);
        System.out.println("The processor of the laptop is " + processor);
        System.out.println("The RAM size of the laptop is " + ram + " GB");
        System.out.println("The storage capacity of the laptop is " + storage + " GB");
        System.out.println("The graphics card of the laptop is " + graphics);
        System.out.println("The screen size of the laptop is " + screen + " inches");
        System.out.println("The battery backup of the laptop is " + battery + " hours");
        System.out.println("The price of the laptop is " + price);
    }
}