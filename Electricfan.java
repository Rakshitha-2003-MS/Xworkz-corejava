class ElectricFan{
    static String itemName = "Orient 1200mm Ceiling Fan";
    static String brandName = "Orient";
    static String color = "Brown";
    static int bladeLength = 1200; 
    static int rpm = 380; 
    static double power = 75.0; 
    static String warranty = "2Years";
    static String material = "Aluminum";
    static long price = 2599L;
    static long ratingCount = 9800L; 
	public static void main(String[] efan){
        /*String itemName = "Orient 1200mm Ceiling Fan";
        String brandName = "Orient";
        String color = "Brown";
        int bladeLength = 1200; 
        int rpm = 380; 
        double power = 75.0; 
        String warranty = "2Years";
        String material = "Aluminum";
        long price = 2599L;
        long ratingCount = 9800L;*/
        System.out.println("The Item name is: " + itemName);
        System.out.println("The Brand name is: " + brandName);
        System.out.println("The Color is: " + color);
        System.out.println("The Blade length is: " + bladeLength + "mm");
        System.out.println("The RPM is: " + rpm);
        System.out.println("The Power is: " + power + "W");
        System.out.println("The Warranty is: " + warranty);
        System.out.println("The Material is: " + material);
        System.out.println("The Price is: " + price);
        System.out.println("The Rating count is: " + ratingCount);
    }
}
