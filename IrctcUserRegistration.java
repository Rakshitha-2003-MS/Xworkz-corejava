class IrctcUserRegistration{
    public static void main(String[] irctc){
		createIrctcAccount("rakshitha_2004", "Prasad@112001", "rakshithams106@gmail.com", 7411254225L, "Aadhar", "Indian");
	}
        /*String userName = "rakshitha_2004";
        String password = "Prasad@112001";
        String email = "rakshithams106@gmail.com";
        long mobileNumber = 7411254225L;
        String idProof = "Aadhar";
        String nationality = "Indian";*/
		
		static void createIrctcAccount(String userName, String password, String email, long mobileNumber, String idProof, String nationality)
        {
		System.out.println("IRCTC Registration");
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("ID Proof: " + idProof);
        System.out.println("Nationality: " + nationality);
    }
}
