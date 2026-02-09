class AadharRegistration{
    public static void main(String[] aadhar){
		saveUserAadhar("Rakshitha M S", 7411254225L, "rakshithams106@gmail.com",  "Channarayapatna, Hassan, Karnataka", 573116, "Update Aadhar");
	}
        /*String name = "Rakshitha M S";
        long mobileNumber = 7411254225L;
        String emailId = "rakshithams106@gmail.com";
        String address = "Channrayapatna, Hassan, Karnataka";
        int pin = 573116;
        String purpose = "Update Aadhar";*/
		
		static void saveUserAadhar(String name, long mobileNumber, String emailId, String address, int pin, String purpose)
        {
        System.out.println("Aadhar Portal Registration");
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Email: " + emailId);
        System.out.println("Address: " + address);
        System.out.println("Pincode: " + pin);
        System.out.println("Purpose: " + purpose);
    }
}
