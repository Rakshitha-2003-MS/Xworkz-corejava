class AjioUserRegistration{
    public static void main(String[] ajio){
		saveAjioAccount(7411254225L, "rakshithams106@gmail.com", "Rakshitha M S", "Prasad#2001", "Female", "Women Fashion","Enabled", "WELCOME500" );
	}
        /*long mobileNumber = 7411254225L;
        String email = "rakshithams106@gmail.com";
        String fullName = "Rakshitha M S";
        String password = "Prasad#2001";
        String gender = "Female";
        String shoppingPreference = "Women Fashion";
        String notification = "Enabled";
        String firstOrderCoupon = "WELCOME500";*/
		
		static void saveAjioAccount(long mobileNumber, String email, String fullName, String password, String gender, String shoppingPreference, String notification, String firstOrderCoupon )
		{
			System.out.println("AJIO Registration Details");
			System.out.println("Mobile Number: " + mobileNumber);
			System.out.println("Email: " + email);
			System.out.println("Full Name: " + fullName);
			System.out.println("Password: " + password);
			System.out.println("Gender: " + gender);
			System.out.println("Shopping Preference: " + shoppingPreference);
			System.out.println("Notification: " + notification);
			System.out.println("New User Coupon: " + firstOrderCoupon);
    }
}
