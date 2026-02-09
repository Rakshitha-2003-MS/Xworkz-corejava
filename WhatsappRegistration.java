class WhatsappRegistration{
    public static void main(String[] whatsapp){
		createWhatsappAccount(7411254225L, "Rakshitha", 540266, "rakshithams106@gmail.com", "Enabled");
	}
        /*long mobileNumber = 7411254225L;
        String userName = "Rakshitha";
        int otp = 540266;
        String backupEmail = "rakshithams106@gmail.com";
        String twoStepVerification = "Enabled";*/
		
		static void createWhatsappAccount(long mobileNumber, String userName, int otp, String backupEmail, String twoStepVerification)
		{
        System.out.println("WhatsApp Registration");
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("User Name: " + userName);
        System.out.println("OTP: " + otp);
        System.out.println("Backup Email: " + backupEmail);
        System.out.println("Two Step Verification: " + twoStepVerification);
    }
}
