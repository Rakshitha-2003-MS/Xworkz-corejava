class OlaRegistration{
    public static void main(String[] ola){
		createOlaAccount(7411254225L, "Rakshitha", "rakshithams106@gmail.com", "Basavashwarnagar" );
	}
        /*long mobileNumber = 7411254225L;
        String name = "Rakshitha";
        String emailId = "rakshithams106@gmail.com";
        String homeLocation = "Basavashwarnagar";*/
		static void createOlaAccount(long mobileNumber, String name, String emailId, String homeLocation ){
        System.out.println("Ola Registration");
        System.out.println("The user mobile number is: " + mobileNumber);
        System.out.println("The Name of the User is: " + name);
        System.out.println("The user Email Id is: " + emailId);
        System.out.println("Home Location of the user is: " + homeLocation);
    }
}
