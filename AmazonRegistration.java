class AmazonRegistration{
    public static void main(String[] amazon){
	saveAmazonUser("Rakshitha", "rakshithams106@gmail.com", "AitAiml@2022", 7411254225L, "Mallavanaghtta, Channarayapatna, Hassan, Karnataka", "No");
	}
        /*String name = "Rakshitha";
        String emailId = "rakshithams106@gmail.com";
        String password = "RPMS@102004";
        String mobileNumber = "7411254225";
        String defaultAddress = "Mallavanaghtta, Channarayapatna, Hassan, Karnataka";
        String primeUser = "No";*/
		
		static void saveAmazonUser(String name, String emailId, String password, long mobileNumber, String defaultAddress, String primeUser){
        System.out.println("Amazon Registration");
        System.out.println("The user Name is: " + name);
        System.out.println("The Email Id of the user is : " + emailId);
        System.out.println("Password is: " + password);
        System.out.println("The User Mobile Number is: " + mobileNumber);
        System.out.println("Default Address is: " + defaultAddress);
        System.out.println("Does the user is Prime User: " + primeUser);
    }
}
