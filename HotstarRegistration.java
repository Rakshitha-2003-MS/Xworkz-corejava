class HotstarRegistration{
	static void savehotstarAccount(long mobileNumber, String emailId, String password, String plan, String language){
        
		/*long mobileNumber = 7411254225L;
        String emailId = "rakshithams106@gmail.com";
        String password = "Prasad$2001";
        String plan = "Super";
        String language = "Kannada";*/
		
        System.out.println("Hotstar Registration");
        System.out.println("User Mobile is: " + mobileNumber);
        System.out.println("User Email Id is: " + emailId);
        System.out.println("Password is: " + password);
        System.out.println("The Plan user preffered is: " + plan);
        System.out.println("User Language specification is: " + language);
	}
	public static void main(String[] hotstar){
		savehotstarAccount(7411254225L, "rakshithams106@gmail.com", "Prasad$2001", "Super", "Kannada");
    }
}
