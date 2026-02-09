class DigiLockerRegistration{
    public static void main(String[] digilocker){
		createDigiLocker("Rakshitha M S", 807305834048L, 7411254225L, "rakshithams106@gmail.com", "rakshitha1011", 9902);
	}
        /*String fullName = "Rakshitha M S";
        long aadharNumber = 807305834048L;
        long mobileNumber = 7411254225L;
        String emailId = "rakshithams106@gmail.com";
        String userName = "rakshitha1011";
        int securityPIN = 9902;*/
		
		static void createDigiLocker(String fullName, long aadharNumber, long mobileNumber, String emailId, String userName, int securityPIN){
        System.out.println("DigiLocker Registration");
        System.out.println("Full Name: " + fullName);
        System.out.println("Aadhar Number: " + aadharNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Email: " + emailId);
        System.out.println("Username: " + userName);
        System.out.println("Security PIN: " + securityPIN);
    }
}
