class GoogleRegistration{
    public static void main(String[] google){
	saveUserPaytm("Rakashitha", "M S", "rakshithams106@gmail.com", "AitAiml@2022", "rakshithamsrakshu@gmail.com", 7411254225L);
	}
        /*String firstName = "Rakashitha";
        String lastName = "M S";
        String emailId = "rakshithams106@gmail.com";
        String password = "AitAiml@2022";
        String recoveryEmail = "rakshithamsrakshu@gmail.com";
        long phoneNumber = 7411254225L;*/
		static void saveUserPaytm(String firstName, String lastName, String emailId, String password, String recoveryEmail, long phoneNumber){
        System.out.println("Google Account Registration");
        System.out.println("The First Name is: " + firstName);
        System.out.println("The Last Name is: " + lastName);
        System.out.println("The Email Id is: " + emailId);
        System.out.println("Password is: " + password);
        System.out.println("Recovery Email is: " + recoveryEmail);
        System.out.println("The Phone Number is: " + phoneNumber);
    }
}
