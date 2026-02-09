class LinkedinUserRegistration{
    public static void main(String[] linkedin){
		saveLinkedinProfile("Rakshitha M S", "rakshithams106@gmail.com", "MSRP@311011", "Student", "Java, SQL, python", "Enabled");
	}
        /*String name = "Rakshitha M S";
        String email = "rakshithams106@gmail.com";
        String password = "MSRP@311011";
        String profession = "Student";
        String skills = "Java, SQL, python";
        String jobAlerts = "Enabled";*/
		
		static void saveLinkedinProfile(String name, String email, String password, String profession, String skills, String jobAlerts)
        {
        System.out.println("LinkedIn Registration");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Profession: " + profession);
        System.out.println("Skills: " + skills);
        System.out.println("Job Alerts: " + jobAlerts);
    }
}
