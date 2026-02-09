class PaytmRegistration{
    static void saveUserPaytm(long phoneNumber, String emailId, String password, String kycStatus, String upiID){
        /*long phoneNumber = 7411254225L;
        String emailId = "rakshithams106@gmail.com";
        String password = "Prasad$990224";
        String kycStatus = "Not Completed";
        String upiID = "7411254225@paytm";*/
        System.out.println("Paytm Registration");
        System.out.println("The Phone Number is: " + phoneNumber);
        System.out.println("The Email Id is: " + emailId);
        System.out.println("Password is: " + password);
        System.out.println("KYC Status: " + kycStatus);
        System.out.println("UPI ID: " + upiID);
    }
	public static void main(String[] paytm){
		saveUserPaytm(7411254225L, "rakshithams106@gmail.com", "Prasad$990224", "Not Completed", "7411254225@paytm");
	}
}
