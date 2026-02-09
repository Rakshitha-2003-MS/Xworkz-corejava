class SnapchatRegistration{
    public static void main(String[] snapChat){
		saveUserSnapchat("Rakshitha", "rakshitha9232", "rakshithams106@gmail.com", "Raksh@1011", "10-06-2003");
	}
       /* String name = "Rakshitha";
        String userName = "rakshitha9232";
        String emailId = "rakshithams106@gmail.com";
        String password = "Raksh@1011";
        String dateOfBirth = "10-06-2003";*/
		static void saveUserSnapchat(String name, String userName, String emailId, String password, String dateOfBirth){
        System.out.println("Snapchat Registration");
        System.out.println("Name of the User is: " + name);
        System.out.println("The Username is: " + userName);
        System.out.println("The Email Id is: " + emailId);
        System.out.println("The Password is: " + password);
        System.out.println("The User Date of Birth is: " + dateOfBirth);
    }
}
