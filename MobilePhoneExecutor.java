class MobilePhoneExecutor {
    public static void main(String[] args){

        String brand = MobilePhone.getBrand();
        String os = MobilePhone.getOperatingSystem();
        String ram = MobilePhone.getRam();
        String cpuModel = MobilePhone.getCpuModel();
        String cpuSpeed = MobilePhone.getCpuSpeed();
        double price = MobilePhone.getPrice();

        System.out.println("The brand of the mobile phone is " + brand);
        System.out.println("The operating system of the mobile phone is " + os);
        System.out.println("The RAM size installed in the mobile phone is " + ram);
        System.out.println("The CPU model used in the mobile phone is " + cpuModel);
        System.out.println("The CPU speed of the mobile phone is " + cpuSpeed);
        System.out.println("The price of the mobile phone is " + price);
    }
}