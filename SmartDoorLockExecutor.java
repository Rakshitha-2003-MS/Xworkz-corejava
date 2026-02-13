class SmartDoorLockExecutor {

    public static void main(String[] args){

        String brand = SmartDoorLock.getBrand();
        boolean fingerprint = SmartDoorLock.hasFingerprintAccess();
        boolean pin = SmartDoorLock.hasPINAccess();
        boolean alarm = SmartDoorLock.hasAlarmSystem();
        int battery = SmartDoorLock.getBatteryLife();
        double price = SmartDoorLock.getPrice();

        System.out.println("The brand of the smart door lock is " + brand);
        System.out.println("The fingerprint access availability in the smart door lock is " + fingerprint);
        System.out.println("The PIN access availability in the smart door lock is " + pin);
        System.out.println("The alarm system availability in the smart door lock is " + alarm);
        System.out.println("The battery life of the smart door lock is " + battery + " months");
        System.out.println("The price of the smart door lock is " + price);
    }
}