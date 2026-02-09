class ZomatoUserRegistration{
    public static void main(String[] zomato){
		saveZomatoUser(7411254225L, "Rakshitha", "rakshithams106@gmail.com", "Chikkamagaluru", "Veg", "No");
	}
        /*long mobileNumber = 7411254225L;
        String name = "Rakshitha";
        String email = "rakshithams106@gmail.com";
        String city = "Chikkamagaluru";
        String diningPreference = "Veg";
        String proMember = "No";*/
		
		static void saveZomatoUser(long mobileNumber, String name, String email, String city, String diningPreference, String proMember)
        {
		System.out.println("Zomato Registration");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("City: " + city);
        System.out.println("Food Preference: " + diningPreference);
        System.out.println("Pro Member: " + proMember);
    }
}
