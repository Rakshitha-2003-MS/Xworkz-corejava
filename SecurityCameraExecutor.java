class SecurityCameraExecutor {

    public static void main(String[] args){

        String brand = SecurityCamera.getBrand();
        int resolution = SecurityCamera.getResolution();
        boolean night = SecurityCamera.hasNightVision();
        boolean motion = SecurityCamera.hasMotionDetection();
        int storage = SecurityCamera.getStorageCapacity();
        double price = SecurityCamera.getPrice();

        System.out.println("The brand of the security camera is " + brand);
        System.out.println("The resolution of the security camera is " + resolution + " pixels");
        System.out.println("The night vision availability in the security camera is " + night);
        System.out.println("The motion detection availability in the security camera is " + motion);
        System.out.println("The storage capacity of the security camera is " + storage + " GB");
        System.out.println("The price of the security camera is " + price);
    }
}