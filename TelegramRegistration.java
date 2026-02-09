class TelegramRegistration{
	static void createTelegramAccount(long mobileNumber, String userName, String displayUserName, int otp, String twoStepVerification){
        /*long mobileNumber = 7411254225L;
        String userName = "rakshitha_ms";
        String displayUserName = "Rakshitha";
        int otp = 425596;
        String twoStepVerification = "Enabled";*/
        System.out.println("Telegram Registration");
        System.out.println("The User Mobile Number is: " + mobileNumber);
        System.out.println("User Name is: " + userName);
        System.out.println("Display User Name: " + displayUserName);
        System.out.println("OTP: " + otp);
        System.out.println("Two Step Verification: " + twoStepVerification);
    }
	public static void main(String[] telegram){
		createTelegramAccount(7411254225L, "rakshitha_ms", "Rakshitha", 425596, "Enabled");
	}
}
