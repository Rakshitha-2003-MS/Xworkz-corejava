class Restaurant{
	public static void main(String[] restaurant){
		String restaurantName = "The illusion";
		String owner = "Rakshitha";
		String managerNames[] = {"Prasad","Shankar"};
		String address = "4th main, 4th B, Basaveshwar Nagar";
		String branches[] = {"Jalahalli","RR Nagar","Rajajinagar"};
		System.out.println("The restaurant name is:"+restaurantName);
		System.out.println("The owner name is:"+owner);
		System.out.println("The managers of the restaurant are:\n");
		for(String manager:managerNames){
		System.out.println(manager);
		}
		System.out.println("\nThe address of the restaurant is:"+address);
		System.out.println("\nThe branches of restaurant are:\n");
		for(String branch:branches){
		System.out.println(branch);
		}
	}
}
		
		